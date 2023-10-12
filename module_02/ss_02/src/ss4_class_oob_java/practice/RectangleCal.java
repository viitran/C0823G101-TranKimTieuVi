package ss4_class_oob_java.practice;

import java.util.Scanner;

public class RectangleCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width;
        double height;
        System.out.println("Nhap chieu rong cua hcn: ");
        width = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap chieu dai cua hcn: ");
        height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangleA = new Rectangle(width,height);
        System.out.println(rectangleA.getDisplay());
        System.out.println("Dien tinh hcn la: " + rectangleA.getArea());
        System.out.println("Chu vi hcn la: " + rectangleA.getPerimeter());
    }
}
