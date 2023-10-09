package ss3_array_method_java.practice;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Nhap do dai cua mang");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("Vui long nhap do dai nho hon 20");
            }
        } while (size > 20);
        array = new int[size];
        //nhap phan tu
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu thu [" + i + "]: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println();
        //duyet mang
        System.out.print("Mang ban dau cua ban la: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //dao nguoc mang
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.println();
        System.out.print("Mang sau khi dao nguoc la: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
