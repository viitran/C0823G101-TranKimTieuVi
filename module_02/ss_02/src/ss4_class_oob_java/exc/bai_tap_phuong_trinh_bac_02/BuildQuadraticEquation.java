package ss4_class_oob_java.exc.bai_tap_phuong_trinh_bac_02;

import java.util.Scanner;

public class BuildQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double delta;
        System.out.print("Enter a: ");
        a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter b: ");
        b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter c: ");
        c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        delta = quadraticEquation.getDiscriminant();
        if (delta < 0) {
            System.out.println("The equation has no roots");
        } else if (delta == 0) {
            System.out.println("The equation has one root: x1 = x2 = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("equation has root x1 = " + quadraticEquation.getRoot1() + "\n" + " root x2 = " + quadraticEquation.getRoot2());
        }
    }
}
