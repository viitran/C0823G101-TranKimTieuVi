package case_study.furama.utils.common;

import java.util.Scanner;

public class InformationFacilityCondition {
    private static Scanner scanner = new Scanner(System.in);
    private static String string;
    private static final String REGEX_CODE = "^SV(VL|HO|RO)-\\d{4}$";

    public static String checkCodeFacility() {
        do {
            try {
                string = scanner.nextLine();
                if (!string.matches(REGEX_CODE)) {
                    throw new NumberFormatException();
                }
                return string;
            } catch (NumberFormatException e) {
                System.out.println("Wrong Format.Re-enter again");
            }
        } while (true);
    }


    //    public static String checkRental(){
//        LocalDate today = LocalDate.now();
//        String date;
//        String returnDate;
//        do {
//            System.out.println("Enter date rental: ");
//            date = checkBirthdayFormat();
//            System.out.println("Enter return date: ");
//            returnDate = checkBirthdayFormat();
//
//        }while (true);
//    }
}
