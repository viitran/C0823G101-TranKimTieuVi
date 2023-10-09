package ss1_introduction_java.practice;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang ban muon biet co bao nhieu ngay: ");
        month = Integer.parseInt(scanner.nextLine());
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + month + " Co 31 ngay!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + month + " Co 30 ngay!");
                break;
            case 2:
                System.out.println("Thang " + month + " Co 29 hoac 28 ngay!");
                break;
            default:
                System.out.println("1 nam co 12 thang ( 1 -> 12)!Vui long nhap lai");
                break;
        }

    }
}
