package case_study.furama.utils.common;

import case_study.furama.model.model_person.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeCondition {
    private static final String REGEX_CODE = "^NV-\\d{4}$";
    private static final String REGEX_IDCARD = "^\\d{9,12}$";
    private static final String REGEX_STRING = "^[A-Z][a-z\\s]{1,50}.*$";
    private static final String REGEX_FORMAT_BIRTHDAY = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
    private static final String REGEX_PHONE_NUMBER = "^0\\d{9}$";
    private static final String REGEX_MAIL_FORMAT = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static Scanner scanner = new Scanner(System.in);
    private static String string;

    public static double checkSalary() {
        boolean isValidSalary = false;
        double salary = 0;
        do {
            try {
                salary = Double.parseDouble(scanner.nextLine());
                if(salary > 0){
                    isValidSalary = true;
                }else{
                    System.out.println("Salary must be greater than 0. Re-enter again:");
                }
            } catch (NumberFormatException e) {
                System.err.print("Wrong format!Re-enter again: ");
            }
        } while (!isValidSalary);
        return salary;
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
                if (!string.matches(REGEX_STRING)) {
                    throw new NumberFormatException();
                }
                return string;
            } catch (NumberFormatException e) {
                System.out.println("======note: Capitalize the first letters of each word======");
                System.err.print("Do not enter number!Re-enter again: ");
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
                if (!code.matches(REGEX_CODE)) {
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
}
