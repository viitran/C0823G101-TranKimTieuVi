package ss15_exception_java.exc;

import java.util.Scanner;

public class CheckTriangleException {
    private static Scanner scanner = new Scanner(System.in);

    private static void checkTriangle(double a, double b, double c) throws Exception {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Cạnh của tam giác không hợp lệ!");
        }
        System.out.println("Tam giác hợp lệ");
    }

    private static Double checkNumber(String side) {
        while (true) {
            try {
                double value = Double.parseDouble(scanner.nextLine());
                if (value <= 0) {
                    System.out.print("Cạnh của tam giác phải là 1 số dương. Vui lòng nhập lại cạnh " + side + " : ");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.print("Lỗi: Vui lòng nhập một số hợp lệ cho cạnh " + side + ": ");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        double a;
        double b;
        double c;
        do {
            try {
                System.out.print("Nhập cạnh a: ");
                a = checkNumber("a");
                System.out.print("Nhập cạnh b: ");
                b = checkNumber("b");
                System.out.print("Nhập cạnh c: ");
                c = checkNumber("c");
                checkTriangle(a, b, c);
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        } while (true);
    }
}

