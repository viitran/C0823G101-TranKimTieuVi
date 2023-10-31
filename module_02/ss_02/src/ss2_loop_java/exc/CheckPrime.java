package ss2_loop_java.exc;

import java.util.Scanner;


public class CheckPrime {

    public static void main(String[] args) {
        System.out.println("Cac so nguyen to dau tien");
        int input;
        int count = 0;
//        int sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban muon hien thi bao nhieu so nguyen to dau tien: ");
        input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; count < input; i++) {
            if (check(i)) {
                System.out.println(i);
                count++;
//                sum += i;
            }
        }
//        System.out.println(sum);

    }

    private static boolean check(int input) {
        if (input < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
