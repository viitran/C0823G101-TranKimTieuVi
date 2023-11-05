package case_study.furama.utils.common;

import case_study.furama.model.model_person.Customer;
import case_study.furama.model.model_person.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class CheckCondition {
    private static final String REGEX_CODE_EMPLOYEE = "^NV-\\d{4}$";
    private static final String REGEX_STRING = "^[A-Za-z].*$";
    private static final String REGEX_IDCARD = "^\\d{9,12}$";
    private static final String REGEX_STRING_NAME = "^[A-Z][a-z\\s]{1,50}.*$";
    private static final String REGEX_FORMAT_BIRTHDAY = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
    private static final String REGEX_PHONE_NUMBER = "^0\\d{9}$";
    private static final String REGEX_MAIL_FORMAT = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final String REGEX_CODE_CUSTOMER = "^KH-\\d{4}$";
    private static Scanner scanner = new Scanner(System.in);
    private static String string;

    public static int checkParseInteger() {
        boolean isValiParseInt = false;
        int value = 0;
        do {
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value > 0) {
                    isValiParseInt = true;
                } else {
                    System.out.println("Your choice must be greater than 0. Re-enter again: ");
                }
            } catch (NumberFormatException e) {
                System.err.print("Please enter number   : ");
            }
        } while (!isValiParseInt);
        return value;
    }

    public static String checkString() {
        do {
            try {
                string = scanner.nextLine();
                if (string.matches(REGEX_STRING)) {
                    return string;
                } else {
                    System.out.println("Please enter string. Re-enter again: ");
                }
            } catch (NumberFormatException e) {
                System.err.print("Please enter string: ");
            }
        } while (true);
    }

    public static double checkSalary() {
        boolean isValidSalary = false;
        double salary = 0;
        do {
            try {
                salary = Double.parseDouble(scanner.nextLine());
                if (salary > 0) {
                    isValidSalary = true;
                } else {
                    System.err.print("Salary must be greater than 0. Re-enter again:");
                }
            } catch (NumberFormatException e) {
                System.err.print("Wrong format!Re-enter again: ");
            }
        } while (!isValidSalary);
        return salary;
    }

    public static String checkRegexCodeCustomer(List<Customer> customerList, String code) {
        do {
            try {
                code = scanner.nextLine();
                if (!code.matches(REGEX_CODE_CUSTOMER)) {
                    throw new NumberFormatException();
                }
                return code;
            } catch (NumberFormatException e) {
                System.err.print("Require input KH-YYYY. Enter again: ");
            }
        } while (true);
    }

    public static String checkFormatMail() {
        do {
            try {
                string = scanner.nextLine();
                if (!string.matches(REGEX_MAIL_FORMAT)) {
                    throw new RuntimeException();
                }
                return string;
            } catch (RuntimeException e) {
                System.out.println("Note: abx@gmail.com");
                System.err.print("Wrong format!Re-enter again: ");
            }
        } while (true);
    }

    public static String checkPhoneNumber() {
        do {
            try {
                string = scanner.nextLine();
                if (!string.matches(REGEX_PHONE_NUMBER)) {
                    throw new NumberFormatException();
                }
                return string;
            } catch (NumberFormatException e) {
                System.out.println("Note: 0xxxxxxxxx");
                System.err.print("Wrong format!Re-enter again: ");
            }
        } while (true);
    }

    public static String checkRegexBirthdayFormat() {
        do {
            try {
                string = scanner.nextLine();
                if (!string.matches(REGEX_FORMAT_BIRTHDAY)) {
                    throw new NumberFormatException();
                }
                return string;
            } catch (NumberFormatException e) {
                System.out.print("Wrong format!Re-enter again: ");
            }
        } while (true);
    }


    public static String checkRegexString() {
        do {
            try {
                string = scanner.nextLine();
                if (!string.matches(REGEX_STRING_NAME)) {
                    throw new NumberFormatException();
                }
                return string;
            } catch (NumberFormatException e) {
                System.out.println("======note: Capitalize the first letters of each word======");
                System.out.print("Re-enter again: ");
            }
        } while (true);
    }

    public static String checkRegexIdCard() {
        do {
            try {
                string = scanner.nextLine();
                if (!string.matches(REGEX_IDCARD)) {
                    throw new NumberFormatException();
                }
                return string;
            } catch (NumberFormatException e) {
                System.err.print("Wrong format!Re-enter again: ");
            }
        } while (true);

    }


    public static String checkRegexFormatCode(List<Employee> employees, String code) {
        do {
            try {
                code = scanner.nextLine();
                if (!code.matches(REGEX_CODE_EMPLOYEE)) {
                    throw new NumberFormatException();
                }
                return code;
            } catch (NumberFormatException e) {
                System.err.print("Require input NV-XXXX. Enter again: ");
            }
        } while (true);
    }

    public static boolean checkExistsCode(List<Employee> employees, String code) {
        for (Employee employee : employees) {
            if (employee.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    public static String inputBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String birthday = null;
        boolean valid = false;
        LocalDate today;
        Period age;
        LocalDate birthDate;
        while (!valid) {
            birthday = checkRegexBirthdayFormat().trim();
            try {
                birthDate = LocalDate.parse(birthday, formatter);
                today = LocalDate.now();
                age = Period.between(birthDate, today);
                if (age.getYears() >= 18) {
                    valid = true;
                } else {
                    System.err.print("You're not yet 18 age. Enter again: ");
                }
            } catch (Exception e) {
                System.err.print("Wrong format!Re-enter again: ");
            }
        }
        return birthday;
    }
}
