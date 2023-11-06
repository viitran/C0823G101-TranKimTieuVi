package case_study.furama.utils.common;

import java.util.Scanner;

public class ExceptionHandler {
    private static Scanner scanner = new Scanner(System.in);
    private static Boolean isVali = false;

    public static int checkParseInteger() {
        int valueInt = 0;
        do {
            try {
                valueInt = Integer.parseInt(scanner.nextLine());
                if (valueInt > 0) {
                    isVali = true;
                } else {
                    System.out.println("Your choice must be greater than 0. Re-enter again: ");
                }
            } catch (NumberFormatException e) {
                System.err.print("Please enter number: ");
            }
        } while (!isVali);
        return valueInt;
    }

    public static Long checkParseLong() {
        long valueLong = 0;
        do {
            try {
                valueLong = Long.parseLong(scanner.nextLine());
                if (valueLong > 0) {
                    isVali = true;
                } else {
                    System.out.println("Greater than 0. Re-enter again: ");
                }
            } catch (NumberFormatException e) {
                System.err.print("please enter number: ");
            }
        } while (!isVali);
        return valueLong;
    }

    public static Double checkParseDouble() {
        double valueDouble = 0;
        do {
            try {
                valueDouble = Double.parseDouble(scanner.nextLine());
                if (30 < valueDouble) {
                    isVali = true;
                } else {
                    System.out.println("Acreage be greater 30.Re-enter again: ");
                }
            } catch (NumberFormatException e) {
                System.err.print("Please enter number: ");
            }
        } while (!isVali);
        return valueDouble;
    }

    public static int checkMaxPerson() {
        int valueInt = 0;
        do {
            try {
                valueInt = Integer.parseInt(scanner.nextLine());
                if (20 > valueInt && valueInt > 0) {
                    isVali = true;
                } else {
                    System.out.println("Max person must be greater than 0 and less than 20. Re-enter again: ");
                }
            } catch (NumberFormatException e) {
                System.err.print("Please enter number: ");
            }
        } while (!isVali);
        return valueInt;
    }
}
