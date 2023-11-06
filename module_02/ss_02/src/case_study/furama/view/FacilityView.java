package case_study.furama.view;

import case_study.furama.controller.FacilityController;
import case_study.furama.model.facility.Facility;
import case_study.furama.model.facility.House;
import case_study.furama.model.facility.Room;
import case_study.furama.model.facility.Villa;
import case_study.furama.utils.common.ExceptionHandler;
import case_study.furama.utils.common.InformationCondition;
import case_study.furama.utils.common.InformationFacilityCondition;

import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private static final FacilityController facilityController = new FacilityController();
    private static int choice;
    private static int count = 0;
    private static int people;
    private static int floor;
    private static String code;
    private static String name;
    private static String freeService;
    private static Double acreage;
    private static Double acreageSwimming;
    private static Long expense;
    private static String standard;

    private static String rental;


    private static final Scanner scanner = new Scanner(System.in);
    private static Boolean isSuccess;

    public static void renderFacilityManagement() {
        do {
            System.out.println("----Facility Management----\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Delete facility\n" +
                    "5. Return main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showListFacility();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    break;
                case 4:
                    deleteFacility(code);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Illegal!Re-enter the choice");
            }
        } while (true);
    }

    private static Map<Facility, Integer> showListFacility() {
        Map<Facility, Integer> facility;
        facility = facilityController.showList();
        if (facility.isEmpty()) {
            System.out.println("Facility is empty!!");
        } else {
            for (Map.Entry<Facility, Integer> map : facility.entrySet()) {
                System.out.println(map.getKey() + " - " + map.getValue());
            }
        }
        return facility;
    }

    private static void deleteFacility(String code) {
        System.out.print("Enter code facility want to delete: ");
        code = scanner.nextLine();
        isSuccess = facilityController.findByCode(code);
        if (isSuccess) {
            System.out.println("Wanna delete this facility?\n" +
                    "1. Yes\n" +
                    "2. No");
            System.out.print("Choose: ");
            choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 1:
                    facilityController.removeFacility(code);
                    System.out.println("=======Delete Complete!=======");
                    break;
                case 2:
                    System.out.println("=======Delete cancel=======");
                    break;
                default:
                    System.out.println("Please choose 1 or 2!");
            }
        } else {
            System.out.println("Can't found this Facility");
        }
    }

    private static void addNewFacility() {
        System.out.println("-------------\n1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu");
        System.out.print("Option to add new: ");
        choice = ExceptionHandler.checkParseInteger();
        switch (choice) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                return;
            default:
                ExceptionHandler.checkParseInteger();
        }
    }

    private static void addNewRoom() {
        Room room;
        while (true) {
            code = inputCodeFacility();
            isSuccess = facilityController.findByCode(code);
            if (isSuccess) {
                System.out.print("Room code is exists!Please Re-enter Villa code: ");
            } else {
                break;
            }
        }
        room = informationRoom();
        room.setCode(code);
        facilityController.addFacility(room, count);
        count++;
        System.out.println("=====Done=====");
    }

    private static void addNewHouse() {
        House house;
        while (true) {
            code = inputCodeFacility();
            isSuccess = facilityController.findByCode(code);
            if (isSuccess) {
                System.out.print("House code is exists!Please Re-enter Villa code: ");
            } else {
                break;
            }
        }
        house = informationHouse();
        house.setCode(code);
        facilityController.addFacility(house, count);
        count++;
        System.out.println("=====Done=====");
    }

    private static void addNewVilla() {
        Villa villa;
        while (true) {
            code = inputCodeFacility();
            isSuccess = facilityController.findByCode(code);
            if (isSuccess) {
                System.out.print("Villa code is exists!Please Re-enter Villa code: ");
            } else {
                break;
            }
        }
        villa = informationVilla();
        villa.setCode(code);
        facilityController.addFacility(villa, count);
        count++;
        System.out.println("=====Done=====");
    }

    private static String inputCodeFacility() {
        System.out.print("Enter code(Ex: SV[VL|RO|HO]-XXXX): ");
        return InformationFacilityCondition.checkCodeFacility();
    }

    private static Villa informationVilla() {
        System.out.print("Enter name Villa: ");
        name = InformationCondition.checkString();
        System.out.print("Enter acreage: ");
        acreage = ExceptionHandler.checkParseDouble();
        System.out.print("Enter expense: ");
        expense = ExceptionHandler.checkParseLong();
        System.out.print("Enter people: ");
        people = ExceptionHandler.checkMaxPerson();
        System.out.print("Enter rental: ");
        rental = scanner.nextLine();
        System.out.println("Enter acreage swimming pool: ");
        acreageSwimming = ExceptionHandler.checkParseDouble();
        System.out.print("Enter standard: ");
        standard = chooseStandard();
        System.out.print("Enter floor of " + name + ": ");
        floor = ExceptionHandler.checkParseInteger();
        return new Villa(code, name, acreage, expense, people, rental, standard, acreageSwimming, floor);
    }

    private static String chooseStandard() {
        do {
            System.out.println("Evaluate: \n" +
                    "1. 5 start \n" +
                    "2. 4 start \n" +
                    "3. 3 start \n" +
                    "4. 2 start \n" +
                    "5. 1 start.");
            System.out.print("your choose is:  ");
            choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 1:
                    return "5 start";
                case 2:
                    return "4 start";
                case 3:
                    return "3 start";
                case 4:
                    return "2 start";
                case 5:
                    return "1 start";
                default:
                    System.out.print("Please choose 1 -> 5.");
            }
        } while (true);
    }


    private static House informationHouse() {
        System.out.println("Enter name House: ");
        name = InformationCondition.checkString();
        System.out.println("Enter acreage: ");
        acreage = ExceptionHandler.checkParseDouble();
        System.out.println("Enter expense: ");
        expense = ExceptionHandler.checkParseLong();
        System.out.println("Enter people: ");
        people = ExceptionHandler.checkMaxPerson();
        System.out.println("Enter rental: ");
        rental = scanner.nextLine();
        System.out.print("Enter standard: ");
        standard = chooseStandard();
        System.out.println("Enter floor of " + name + ": ");
        floor = ExceptionHandler.checkParseInteger();
        return new House(code, name, acreage, expense, people, rental, standard, floor);
    }

    private static Room informationRoom() {
        System.out.println("Enter name Room: ");
        name = InformationCondition.checkString();
        System.out.println("Enter acreage: ");
        acreage = ExceptionHandler.checkParseDouble();
        System.out.println("Enter expense: ");
        expense = ExceptionHandler.checkParseLong();
        System.out.println("Enter people: ");
        people = ExceptionHandler.checkMaxPerson();
        System.out.println("Enter rental: ");
        rental = scanner.nextLine();
        System.out.println("Choose free service: ");
        freeService = chooseFreeService();
        return new Room(code, name, acreage, expense, people, rental, freeService);
    }

    private static String chooseFreeService() {
        do {
            System.out.println("Choose free service: \n" +
                    "1. Parking and shuttle service\n" +
                    "2. Housekeeping service\n" +
                    "3. Massage\n" +
                    "4. None");
            System.out.println("choose 1 service: ");
            choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 1:
                    return "Parking and shuttle service";
                case 2:
                    return "Housekeeping service";
                case 3:
                    return "Massage";
                case 4:
                    return "None";
                default:
                    System.out.println("Please choose 1 -> 4");
            }
        } while (true);
    }
}
