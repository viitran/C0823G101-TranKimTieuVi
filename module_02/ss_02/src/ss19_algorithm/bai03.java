package ss19_algorithm;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

public class bai03 {
    public static void main(String[] args) {
        equation();
    }

    private static void equation() {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập hệ số a: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập hệ số b: ");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập hệ số c: ");
                double c = Double.parseDouble(scanner.nextLine());
                System.out.println("Phương trình bậc 2 có dạng: " + a + "x^2 + " + b + "x + " + c);
                double delta = (b * b) - (4 * a * c);
                if (delta > 0) {
                    System.out.println("Phương trình co' 2 nghiệm phân biệt: ");
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("2 nghiệm pb: " + x1 + "\n" + x2);
                } else if (delta == 0) {
                    System.out.println("Phương trình v nghiệm");
                } else {
                    System.out.println("Phương trình có 1 nghiệm: ");
                    double x3 = (-c) / b;
                    System.out.println(x3);
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập số!");
            }
        } while (true);
    }
}
