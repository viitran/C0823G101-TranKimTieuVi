package case_study.furama.view;

import case_study.furama.controller.FacilityController;
import case_study.furama.utils.common.ExceptionHandler;
import case_study.furama.utils.common.InformationCondition;


import java.util.*;

public class MainView {
    private static final FacilityController facilityController = new FacilityController();
    private static int choice;
    private static final Scanner scanner = new Scanner(System.in);

    public void renderView() {
        System.out.println("FURAMA MANAGEMENT");
        mainMenu();
    }

    private static void mainMenu() {
        do {
            System.out.println("------Menu--------\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            System.out.print("Enter your choice: ");
            choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 1:
                    EmployeeView.renderEmployeeManagement();
                    break;
                case 2:
                    CustomerView.renderCustomerManagement();
                    break;
                case 3:
                    FacilityView.renderFacilityManagement();
                    break;
                case 4:
                    renderBookingManagement();
                    break;
                case 5:
                    renderPromotionManagement();
                    break;
                case 6:
                    System.exit(1);
                default:
                    ExceptionHandler.checkParseInteger();
            }
        } while (true);
    }

    private static void renderBookingManagement() {
        do {
            System.out.println("----Booking Management----\n" +
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Illegal!Re-enter the choice");
            }
        } while (true);
    }

    private static void renderPromotionManagement() {
        do {
            System.out.println("----Promotion Management----\n" +
                    "1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Illegal!Re-enter the choice");
            }
        } while (true);
    }

}
