package case_study.furama.view;

import case_study.furama.controller.EmployeeController;
import case_study.furama.model.Employee;
import case_study.furama.utils.common.EmployeeCondition;

import java.util.List;
import java.util.Scanner;

public class MainView {
    private static final EmployeeController employeeController = new EmployeeController();
    //    private static List<Employee> employeeList = new LinkedList<>();
    private static int choice;
    private static String code;
    private static String name;
    private static String birthday;
    private static String gender;
    private static long idCard;
    private static String phoneNumber;
    private static String email;
    private static String level;
    private static String position;
    private static double wage;
    private static final Scanner scanner = new Scanner(System.in);
    private static Boolean isSuccess;

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
                    renderCustomerManagement();
                    break;
                case 3:
                    renderFacilityManagement();
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
                    System.out.println("Illegal!Re-enter the choice");
            }
        } while (true);
    }

    private static void renderEmployeeManagement() {
        List<Employee> employees = employeeController.showList();
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
                    showList(employees);
                    break;
                case 2:
                    addEmployee(employees, code);
                    break;
                case 3:
                    editEmployee(employees, code);
                    break;
                case 4:
                    removeEmployee(employees, code);
                    break;
                case 5:
                    searchEmployeeByName(employees);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Illegal!Re-enter the choice");
            }
        } while (true);
    }

    private static void showList(List<Employee> employeeList) {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    private static void addEmployee(List<Employee> employees, String code) {
        Employee employee;
        while (true) {
            code = inputCode(employees, code);
            employee = employeeController.findByCode(code);
            if (employee != null) {
                System.out.println("Employee code is exists!Please Re-enter employee code");
            } else {
                break;
            }
        }
        employee = inputInformation();
        employee.setCode(code);
        employeeController.addEmployee(employee);
        System.out.println("=====Done=====");
    }

    private static void editEmployee(List<Employee> employees, String code) {
        Employee employee;
        System.out.print("Enter code employee: ");
        code = EmployeeCondition.checkRegexFormatCode(employees, code);
        employee = employeeController.findByCode(code);
        if (employee != null) {
            System.out.println("wanna edit information this employee?\n" +
                    "1. Yes\n" +
                    "2. No");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("old information employee: ");
                    System.out.println(employee);
                    employeeController.editEmployee(inputInformation(), code);
                    break;
                case 2:
                    System.out.println("cancel!");
                    break;
                default:
                    System.out.println("Re-enter choice again!! choose 1 or 2");
            }
        } else {
            System.out.println("Cant found code employee");
        }
    }

    private static void searchEmployeeByName(List<Employee> employees) {
        System.out.print("Enter name employee: ");
        name = scanner.nextLine();
        employees = employeeController.searchEmployeeByName(employeeController.showList(), name);
        if (!employees.isEmpty()) {
            System.out.println("Found employee: ");
            System.out.println(employees);
        } else {
            System.out.println("Cant found name employee");
        }
    }

    private static void removeEmployee(List<Employee> employees, String code) {
        code = inputCode(employees, code);
        isSuccess = employeeController.removeEmployee(code);
        if (isSuccess) {
            System.out.println("Wanna remove employee ?\n" +
                    "1. Yes\n" +
                    "2. No");
            System.out.print("choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("=====complete=====");
                    break;
                case 2:
                    System.out.println("Remove employee cancel!");
                    break;
                default:
                    System.out.println("Re-enter choice again!! choose 1 or 2");
            }
        } else {
            System.out.println("Can't found employee code!");
        }

    }


    private static String inputCode(List<Employee> employees, String code) {
        System.out.print("Enter employee code(Ex: NV-0001): ");
        return EmployeeCondition.checkRegexFormatCode(employees, code);
    }

    private static Employee inputInformation() {
        System.out.print("Enter name employee: ");
        name = EmployeeCondition.checkRegexString();
        System.out.print("Enter birthday (dd/mm/yyyy):  ");
        birthday = EmployeeCondition.checkRegexBirthdayFormat();
        System.out.print("Enter gender: ");
        gender = scanner.nextLine();
        System.out.print("Enter idCard (at least 9 numbers and at most 12 numbers): ");
        idCard = EmployeeCondition.checkRegexIdCard();
        System.out.print("Enter phone number(Ex: 0xxxxxxxxx): ");
        phoneNumber = EmployeeCondition.checkPhoneNumber();
        System.out.print("Enter email: ");
        email = EmployeeCondition.checkFormatMail();
        System.out.print("Enter level(intermediate,college,university,After university): ");
        level = scanner.nextLine();
        System.out.print("Enter position(receptionist,server,specialist,supervisor,manager,director): ");
        position = scanner.nextLine();
        System.out.print("Enter wage($): ");
        wage = Double.parseDouble(scanner.nextLine());
        return new Employee(name, birthday, gender, idCard, phoneNumber, email, level, position, wage);
    }


    private static void renderCustomerManagement() {
        do {
            System.out.println("----Customer Management----\n" +
                    "1. Display list customer\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Delete customer\n" +
                    "5. Search by name customer\n" +
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

    private static void renderFacilityManagement() {
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
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Illegal!Re-enter the choice");
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
