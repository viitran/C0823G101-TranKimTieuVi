package ss2_loop_java.exc;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to dau tien");
        for (int i = 0; i < 100; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }
}
