package ss1_introduction_java.practice;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println("Kiem tra nam nhuan!");
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nam ban muon kiem tra: ");
        year = Integer.parseInt(scanner.nextLine());
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " La nam nhuan");
                } else {
                    System.out.println(year + " Khong phai la nam nhuan!");
                }
            } else {
                System.out.println(year + " La nam nhuan");
            }
        } else {
            System.out.println(year + " Khong phai la nam nhuan!");
        }
    }
}
