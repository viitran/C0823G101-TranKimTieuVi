package case_study.draft.furama_resort.view;

import java.util.List;
import java.util.Scanner;

public class MainView {
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;

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
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    renderEmployeeManagement();
                    break;
                case 2:
//                    renderCustomerManagement();
                    break;
                case 3:
//                    renderFacilityManagement();
                    break;
                case 4:
//                    renderBookingManagement();
                    break;
                case 5:
//                    renderPromotionManagement();
                    break;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Illegal!Re-enter the choice");
            }
        } while (true);
    }

    private static void renderEmployeeManagement() {
//        List<Employee> employees = employeeController.showList();
        do {
            System.out.println("----Employee Management----\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Delete employee\n" +
                    "5. Search by name employee\n" +
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
}
