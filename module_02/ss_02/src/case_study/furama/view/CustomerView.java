package case_study.furama.view;

import case_study.furama.controller.CustomerController;
import case_study.furama.model.model_person.Customer;
import case_study.furama.utils.common.ExceptionHandler;
import case_study.furama.utils.common.InformationCondition;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
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
    private static final Scanner scanner = new Scanner(System.in);
    private static Boolean isSuccess;

    public static void renderCustomerManagement() {
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
            choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 1:
                    showListCustomer();
                    break;
                case 2:
                    addCustomer(code);
                    break;
                case 3:
                    editCustomer(code);
                    break;
                case 4:
                    deleteCustomer(code);
                    break;
                case 5:
                    searchCustomer(customerList);
                    break;
                case 6:
                    return;
                default:
                    ExceptionHandler.checkParseInteger();
            }
        } while (true);
    }

    private static void editCustomer(String code) {
        Customer customer;
        System.out.print("Enter code customer(Ex: NV-XXXX): ");
        code = InformationCondition.checkCode(code);
        customer = customerController.findByCode(code);
        if (customer != null) {
            System.out.println("wanna edit information this customer?\n" +
                    "1. Yes\n" +
                    "2. No");
            System.out.print("Choice: ");
            choice = ExceptionHandler.checkParseInteger();
            switch (choice) {
                case 1:
                    System.out.print("old information customer: ");
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
            System.out.println("Cant found code customer");
        }
    }

    private static void searchCustomer(List<Customer> customers) {
        System.out.print("Enter name Customer: ");
        name = InformationCondition.checkInputName();
        customers = customerController.searchCustomer(customerController.showListCustomer(), name);
        if (!customers.isEmpty()) {
            System.out.println("Found Customer: ");
            System.out.println(customers);
        } else {
            System.out.println("Cant found name Customer");
        }
    }

    private static void deleteCustomer(String code) {
        code = inputCodeCustomer(code);
        isSuccess = customerController.deleteCustomer(code);
        if (isSuccess) {
            System.out.println("Wanna remove customer ?\n" +
                    "1. Yes\n" +
                    "2. No");
            System.out.print("choice: ");
            choice = ExceptionHandler.checkParseInteger();
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
            System.out.println("List is empty");
        }
    }

    private static void addCustomer(String code) {
        Customer customer;
        while (true) {
            code = inputCodeCustomer(code);
            customer = customerController.findByCode(code);
            if (customer != null) {
                System.out.print("Customer code is exists!Please Re-enter customer code: ");
            } else {
                break;
            }
        }
        customer = inputInfor();
        customer.setCode(code);
        customerController.addCustomer(customer);
        System.out.println("=====Done=====");
    }

    private static String inputCodeCustomer(String code) {
        System.out.print("Enter Customer code(Ex: KH-0001): ");
        return InformationCondition.checkCode(code);
    }

    private static Customer inputInfor() {
        System.out.print("Enter name Customer: ");
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
        level = chooseLevelCustomer();
        System.out.print("Enter address: ");
        address = scanner.nextLine();
        return new Customer(code, name, gender, birthday, idCard, phoneNumber, email, level, address);
    }

    private static String chooseLevelCustomer() {
        do {
            System.out.print("-------------\n1.Diamond\n" +
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
}
