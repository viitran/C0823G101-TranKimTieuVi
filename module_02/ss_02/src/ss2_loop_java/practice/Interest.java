package ss2_loop_java.practice;

import ss1_introduction_java.practice.SystemTime;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money,interestRate;
        int month;
        double totalInterest = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Money: ");
        money = Double.parseDouble(scanner.nextLine());
        if (money < 0){
            System.out.println("So tien khong duoc am!");
        }
        System.out.println("Input Month: ");
        month = Integer.parseInt(scanner.nextLine());
        if (month < 0){
            System.out.println("Thang khong duoc am!");
        }
        System.out.println("Input interest rate: ");
        interestRate = Double.parseDouble(scanner.nextLine());
        if (interestRate < 0){
            System.out.println("Lai suat khong hop le!");
        }
        for (int i = 0; i < month; i++) {
            totalInterest = money * (interestRate/100)/12 * month;
        }
        System.out.println("Tien gui: " + money + "VND");
        System.out.println("So thang gui: " + month + " thang");
        System.out.println("Lai suat: " + interestRate + "%");
        System.out.println("So tien lai ban nhan lai duoc sau " + month + " thang la: " + totalInterest + " VND");
    }
}
