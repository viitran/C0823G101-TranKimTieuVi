package ss2_loop_java.practice;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        boolean check = true;
        int number;
        System.out.println("Kiem tra so nguyen to!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = Integer.parseInt(scanner.nextLine());
        if (number < 2) {
            System.out.println(number + " khong phai la so nguyen to!");
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " la so nguyen to");
            else
                System.out.println(number + " khong phai la so nguyen to!");
        }
    }
}


