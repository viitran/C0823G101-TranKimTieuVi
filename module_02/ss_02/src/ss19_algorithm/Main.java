package ss19_algorithm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n số tự nhiên: ");
        int number = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i <= 200; i++) {
//            if (i % 7 == 0 && i % 5 != 0) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 0; i < number; i++) {
//            System.out.println(i);
//        }
//        System.out.println("Giai thừa của n số tu nhien la: " + factorial(number));
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i <= number; i++) {
//            map.put(i, i * i);
//        }
//        System.out.println(map);
    }

    private static int factorial(int number) {
        if (number > 0) {
            return number * factorial(number - 1);
        } else {
            return 1;
        }
    }


}
