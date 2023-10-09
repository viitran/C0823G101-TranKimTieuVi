package ss1_introduction_java.practice;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        double a, b;
        System.out.println("Giai phuong trinh bac nhat!");
        System.out.println("Phuong trinh bac nhat co dang: y = ax + b");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so a:");
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap he so b:");
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("He so a = " + a);
        System.out.println("He so b = " + b);
        System.out.println("Phuong trinh bac nhat cua ban co dang y = " + a + " * x + " + b);
        if (a != 0) {
            double answer = - b / a;
            System.out.print("Phuong trinh co nghiem = " + answer);
        } else {
            if (b == 0) {
                System.out.print("Phuong trinh co vo so nghiem!");
            } else {
                System.out.print("Phuong trinh khong co nghiem!");
            }
        }
    }

}

