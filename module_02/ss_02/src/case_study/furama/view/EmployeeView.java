package case_study.furama.view;

import case_study.furama.controller.EmployeeController;
import case_study.furama.model.model_person.Employee;
import case_study.furama.utils.common.ExceptionHandler;
import case_study.furama.utils.common.InformationCondition;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static final EmployeeController employeeController = new EmployeeController();
    private static int choice;
    private static String name;
    private static String code;
    private static String birthday;
    private static String gender;
    private static String idCard;
    private static String phoneNumber;
    private static String email;
    private static String level;
    private static String position;
    private static double salary;
    private static Boolean isSuccess;

    private static final Scanner scanner = new Scanner(System.in);

    public static void renderEmployeeManagement() {
        List<Employee> employees = employeeController.showList();
        do {
            System.out.println("======Employee Management======\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Delete employee\n" +
                    "5. Search by name employee\n" +
                    "6. Return main menu");
            System.out.print("Enter your choice: ");
            choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 1:
                    showListEmployee();
                    break;
                case 2:
                    addEmployee(code);
                    break;
                case 3:
                    editEmployee(code);
                    break;
                case 4:
                    removeEmployee(code);
                    break;
                case 5:
                    searchEmployeeByName(employees);
                    break;
                case 6:
                    return;
                default:
                    ExceptionHandler.checkParseInteger();
            }
        } while (true);
    }

    private static void showListEmployee() {
        List<Employee> employees = employeeController.showList();
        if (!employees.isEmpty()) {
            for (Employee e : employees) {
                System.out.println(e);
            }
        } else {
            System.out.println("File has nothing!");
        }
    }

    private static void addEmployee(String code) {
        Employee employee;
        while (true) {
            code = inputCode(code);
            employee = employeeController.findByCode(code);
            if (employee != null) {
                System.out.print("Employee code is exists!Please Re-enter employee code: ");
            } else {
                break;
            }
        }
        employee = inputInformation();
        employee.setCode(code);
        employeeController.addEmployee(employee);
        System.out.println("=====Done=====");
    }

    private static void editEmployee(String code) {
        Employee employee;
        System.out.print("Enter code employee: ");
        code = InformationCondition.checkCode(code);
        employee = employeeController.findByCode(code);
        if (employee != null) {
            System.out.println("wanna edit information this employee?\n" +
                    "1. Yes\n" +
                    "2. No");
            System.out.print("Choice: ");
            choice = ExceptionHandler.checkParseInteger();
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
        name = InformationCondition.checkInputName();
        employees = employeeController.searchEmployeeByName(employeeController.showList(), name);
        if (!employees.isEmpty()) {
            System.out.println("Found employee: ");
            System.out.println(employees);
        } else {
            System.out.println("Cant found name employee");
        }
    }

    private static void removeEmployee(String code) {
        code = inputCode(code);
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

    private static String inputLevel() {
        do {
            System.out.print("-------------\n1.Intermediate\n" +
                    "2.College\n" +
                    "3.University\n" +
                    "4.After university\n");
            System.out.print("choose level:");
            choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 1:
                    return "Intermediate";
                case 2:
                    return "College";
                case 3:
                    return "University";
                case 4:
                    return "After university";
                default:
                    System.out.println("Illegal!Re-enter the choice");
            }
        } while (true);
    }

    private static String inputPosition() {
        do {
            System.out.print("-------------\n1.Receptionist\n" +
                    "2.Server\n" +
                    "3.Specialist\n" +
                    "4.Supervisor\n" +
                    "5.Manager\n" +
                    "6.Director\n");
            System.out.print("choose position:");
            choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 1:
                    return "Receptionist";
                case 2:
                    return "Server";
                case 3:
                    return "Specialist";
                case 4:
                    return "Supervisor";
                case 5:
                    return "Manager";
                case 6:
                    return "Director";
                default:
                    System.out.println("Illegal!Re-enter the choice");
            }
        } while (true);
    }


    private static String inputCode(String code) {
        System.out.print("Enter employee code(Ex: NV-0001): ");
        return InformationCondition.checkCode(code);
    }

    private static Employee inputInformation() {
        System.out.print("Enter name employee: ");
        name = InformationCondition.checkInputName();
        System.out.print("Enter birthday (dd/mm/yyyy):  ");
        birthday = InformationCondition.checkAge();
        System.out.print("Enter gender: ");
        gender = InformationCondition.checkString();
        System.out.print("Enter idCard (at least 9 numbers and at most 12 numbers): ");
        idCard = InformationCondition.checkIdCard();
        System.out.print("Enter phone number(Ex: 0xxxxxxxxx): ");
        phoneNumber = InformationCondition.checkPhoneNumber();
        System.out.print("Enter email: ");
        email = InformationCondition.checkFormatMail();
        System.out.print("Enter level: ");
        level = inputLevel();
        System.out.print("Enter position: ");
        position = inputPosition();
        System.out.print("Enter wage($): ");
        salary = InformationCondition.checkSalary();
        return new Employee(name, gender, birthday, idCard, phoneNumber, email, level, position, salary);
    }
}
