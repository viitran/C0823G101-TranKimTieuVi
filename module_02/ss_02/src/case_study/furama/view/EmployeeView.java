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
                    System.out.println("old information employee: " +
                            "Name: " + employee.getName() + "\n" +
                            "Birthday: " + employee.getBirthday() + "\n" +
                            "Gender: " + employee.getGender() + "\n" +
                            "Id card: " + employee.getIdCard() + "\n" +
                            "Phone number: " + employee.getPhoneNumber() + "\n" +
                            "Email: " + employee.getMail() + "\n" +
                            "Position: " + employee.getPosition() + "\n" +
                            "Level: " + employee.getLevel() + "\n" +
                            "Salary: " + employee.getSalary());
                    EditEachSelection();
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

    private static void EditEachSelection() {
        do {
            System.out.println("------Choose information want to edit this employee: \n" +
                    "1.Name\n" +
                    "2.Birthday\n" +
                    "3.Gender\n" +
                    "4.Id Card\n" +
                    "5.Phone Number\n" +
                    "6.Email\n" +
                    "7.Position\n" +
                    "8.Level\n" +
                    "9.Salary\n" +
                    "0.Return");
            choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 1:
                    employeeController.editNewName(code, inputNewName());
                    break;
                case 2:
                    employeeController.editNewBirthday(code, inputNewBirthday());
                    break;
                case 3:
                    employeeController.editNewGender(code, inputGender());
                    break;
                case 4:
                    employeeController.editNewIdCard(code, inputNewIdCard());
                    break;
                case 5:
                    employeeController.editNewPhoneNumber(code, inputNewPhoneNumber());
                    break;
                case 6:
                    employeeController.editNewEmail(code, inputNewEmail());
                    break;
                case 7:
                    employeeController.editNewPosition(code, inputPosition());
                    break;
                case 8:
                    employeeController.editNewLevel(code, inputLevel());
                    break;
                case 9:
                    employeeController.editNewSalary(code, inputNewSalary());
                    break;
                case 0:
                    return;
            }
        } while (true);
    }

    private static String inputNewPhoneNumber() {
        System.out.print("Enter phone number(Ex: 0xxxxxxxxx): ");
        return InformationCondition.checkPhoneNumber();
    }

    private static String inputNewEmail() {
        System.out.print("Enter email: ");
        return InformationCondition.checkFormatMail();
    }

    private static double inputNewSalary() {
        System.out.print("Enter wage($): ");
        return InformationCondition.checkSalary();
    }

    private static String inputNewIdCard() {
        System.out.print("Enter idCard (at least 9 numbers and at most 12 numbers): ");
        return InformationCondition.checkIdCard();
    }

    private static String inputNewName() {
        System.out.print("Enter name employee: ");
        return InformationCondition.checkInputName();
    }

    private static String inputNewBirthday() {
        System.out.print("Enter birthday (dd/mm/yyyy):  ");
        return InformationCondition.checkAge();
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
        Employee employee = employeeController.findByCode(code);
        if (employee != null) {
            System.out.println("Wanna remove employee ?\n" +
                    "1. Yes\n" +
                    "2. No");
            System.out.print("choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeController.removeEmployee(code);
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
        gender = inputGender();
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

    private static String inputGender() {
        do {
            System.out.println("Choose your gender: \n" +
                    "1. Female\n" +
                    "2. Male\n" +
                    "3. LGBT\n" +
                    "4. Secret");
            choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 1:
                    return "Female";
                case 2:
                    return "Male";
                case 3:
                    return "LGBT";
                case 4:
                    return "Secret";
                default:
                    ExceptionHandler.checkParseInteger();
            }
        } while (true);
    }
}
