package ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.utils.exception_handler;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class checkCondition {
    private static Scanner scanner = new Scanner(System.in);

    public static int checkIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Lựa chọn không hợp lệ!Nhập lại lựa chọn: ");
            }
        }
    }

//    public static String checkName() {
//        String input = "";
//        while (true) {
//            try {
//                input = scanner.nextLine();
//            } catch (InputMismatchException e) {
//                System.err.println("Vui lòng nhập chữ!Vui lòng nhập lại " + input + " :");
//            }
//        }
//    }

    public static Long checkLongInput() {
        while (true) {
            try {
                return Long.parseLong(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Lựa chọn không hợp lệ!Nhập lại lựa chọn: ");
            }
        }
    }
}
