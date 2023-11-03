package case_study.furama.view;

import case_study.furama.controller.CustomerController;
import case_study.furama.controller.EmployeeController;
import case_study.furama.model.model_person.Customer;
import case_study.furama.model.model_person.Employee;
import case_study.furama.utils.common.CheckCondition;

import java.util.List;
import java.util.Scanner;

public class MainView {
    private static final EmployeeController employeeController = new EmployeeController();
    private static final CustomerController customerController = new CustomerController();
    private static int choice;
    private static String address;
    private static String code;
    private static String name;
    private static String birthday;
    private static String gender;
    private static String idCard;
    private static String phoneNumber;
    private static String email;
    private static String level;
    private static String position;
    private static double salary;
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
            System.out.println("======Employee Management======\n" +
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
                    showList();
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

    private static void showList() {
        List<Employee> employees = employeeController.showList();
        if (!employees.isEmpty()) {
            for (Employee e : employees) {
                System.out.println(e);
            }
        } else {
            System.out.println("File has nothing!");
        }

    }

    private static void addEmployee(List<Employee> employees, String code) {
        Employee employee;
        while (true) {
            code = inputCode(employees, code);
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

    private static void editEmployee(List<Employee> employees, String code) {
        Employee employee;
        System.out.print("Enter code employee: ");
        code = CheckCondition.checkRegexFormatCode(employees, code);
        employee = employeeController.findByCode(code);
        if (employee != null) {
            System.out.println("wanna edit information this employee?\n" +
                    "1. Yes\n" +
                    "2. No");
            System.out.print("Choice: ");
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

    private static String inputLevel() {
        do {
            System.out.print("\n1.Intermediate\n" +
                    "2.College\n" +
                    "3.University\n" +
                    "4.After university\n");
            System.out.print("choose level:");
            choice = Integer.parseInt(scanner.nextLine());
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
            System.out.print("\n1.Receptionist\n" +
                    "2.Server\n" +
                    "3.Specialist\n" +
                    "4.Supervisor\n" +
                    "5.Manager\n" +
                    "6.Director\n");
            System.out.print("choose position:");
            choice = Integer.parseInt(scanner.nextLine());
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


    private static String inputCode(List<Employee> employees, String code) {
        System.out.print("Enter employee code(Ex: NV-0001): ");
        return CheckCondition.checkRegexFormatCode(employees, code);
    }

    private static Employee inputInformation() {
        System.out.print("Enter name employee: ");
        name = CheckCondition.checkRegexString();
        System.out.print("Enter birthday (dd/mm/yyyy):  ");
        birthday = CheckCondition.checkRegexBirthdayFormat();
        System.out.print("Enter gender: ");
        gender = scanner.nextLine();
        System.out.print("Enter idCard (at least 9 numbers and at most 12 numbers): ");
        idCard = CheckCondition.checkRegexIdCard();
        System.out.print("Enter phone number(Ex: 0xxxxxxxxx): ");
        phoneNumber = CheckCondition.checkPhoneNumber();
        System.out.print("Enter email: ");
        email = CheckCondition.checkFormatMail();
        System.out.print("Enter level: ");
        level = inputLevel();
        System.out.print("Enter position: ");
        position = inputPosition();
        System.out.print("Enter wage($): ");
        salary = CheckCondition.checkSalary();
        return new Employee(name, gender, birthday, idCard, phoneNumber, email, level, position, salary);
    }


    private static void renderCustomerManagement() {
        List<Customer> customerList = customerController.showListCustomer();
        do {
            System.out.println("======Customer Management======\n" +
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
                    showListCustomer();
                    break;
                case 2:
                    addCustomer(customerList, code);
                    break;
                case 3:
                    editCustomer(customerList, code);
                    break;
                case 4:
                    deleteCustomer(customerList, code);
                    break;
                case 5:
                    searchCustomer(customerList);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Illegal!Re-enter the choice");
            }
        } while (true);
    }

    private static void editCustomer(List<Customer> customerList, String code) {
        Customer customer;
        System.out.print("Enter code employee: ");
        code = CheckCondition.checkRegexCodeCustomer(customerList, code);
        customer = customerController.findByCode(code);
        if (customer != null) {
            System.out.println("wanna edit information this customer?\n" +
                    "1. Yes\n" +
                    "2. No");
            System.out.print("Choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("old information employee: ");
                    System.out.println(customer);
                    customerController.editCustomer(inputInfor(), code);
                    System.out.println("========Done==========");
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

    private static void searchCustomer(List<Customer> customers) {
        System.out.print("Enter name Customer: ");
        name = scanner.nextLine();
        customers = customerController.searchCustomer(customerController.showListCustomer(), name);
        if (!customers.isEmpty()) {
            System.out.println("Found Customer: ");
            System.out.println(customers);
        } else {
            System.out.println("Cant found name Customer");
        }
    }

    private static void deleteCustomer(List<Customer> customers, String code) {
        code = inputCodeCustomer(customers, code);
        isSuccess = customerController.deleteCustomer(code);
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
                    System.out.println("Remove Customer cancel!");
                    break;
                default:
                    System.out.println("Re-enter choice again!! choose 1 or 2");
            }
        } else {
            System.out.println("Can't found Customer code!");
        }
    }

    private static void showListCustomer() {
        List<Customer> customerList = customerController.showListCustomer();
        if (!customerList.isEmpty()) {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        } else {
            System.out.println("File has nothing!");
        }
    }

    private static void addCustomer(List<Customer> customerList, String code) {
        Customer customer;
        while (true) {
            code = inputCodeCustomer(customerList, code);
            customer = customerController.findByCode(code);
            if (customer != null) {
                System.out.print("Customer code is exists!Please Re-enter employee code: ");
            } else {
                break;
            }
        }
        customer = inputInfor();
        customer.setCode(code);
        customerController.addCustomer(customer);
        System.out.println("=====Done=====");
    }

    private static String inputCodeCustomer(List<Customer> customerList, String code) {
        System.out.print("Enter Customer code(Ex: KH-0001): ");
        return CheckCondition.checkRegexCodeCustomer(customerList, code);
    }

    private static Customer inputInfor() {
        System.out.print("Enter name Customer: ");
        name = CheckCondition.checkRegexString();
        System.out.print("Enter birthday (dd/mm/yyyy):  ");
        birthday = CheckCondition.checkRegexBirthdayFormat();
        System.out.print("Enter gender: ");
        gender = scanner.nextLine();
        System.out.print("Enter idCard (at least 9 numbers and at most 12 numbers): ");
        idCard = CheckCondition.checkRegexIdCard();
        System.out.print("Enter phone number(Ex: 0xxxxxxxxx): ");
        phoneNumber = CheckCondition.checkPhoneNumber();
        System.out.print("Enter email: ");
        email = CheckCondition.checkFormatMail();
        System.out.print("Enter level: ");
        level = chooseLevelCustomer();
        System.out.print("Enter address: ");
        address = scanner.nextLine();
        return new Customer(code, name, gender, birthday, idCard, phoneNumber, email, level, address);
    }

    private static String chooseLevelCustomer() {
        do {
            System.out.print("\n1.Diamond\n" +
                    "2.Platinum\n" +
                    "3.Gold\n" +
                    "4.Silver\n" +
                    "5.Member\n");
            System.out.print("choose:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    return "Diamond";
                case 2:
                    return "Platinum";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
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
