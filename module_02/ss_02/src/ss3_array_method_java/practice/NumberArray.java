package ss3_array_method_java.practice;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.print("Nhap do dai cua mang: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("Do dai khong duoc qua 20!Vui long nhap lai!!");
            } else if (size < 0) {
                System.out.println("Do dai khong duoc la so am!Vui long nhap lai!");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu [" + i + "]: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Mang ban dau cua ban: ");
        for (int j : array) {
            System.out.print(j + " ");
        }

        //tim max
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.print("Gia tri lon nhat trong mang la: " + max);
    }
}
