package ss3_array_method_java.exc;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        int min;
        System.out.print("Nhap do dai cua mang: ");
        size = Integer.parseInt(scanner.nextLine());
        if (size < 0) {
            System.out.println("Do dai cua mang khong duoc am!");
            System.out.println("Nhap lai do dai cua mang: ");
            size = Integer.parseInt(scanner.nextLine());
        }
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu [" + i + "]: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mang co kich thuoc = " + size + " la: " + Arrays.toString(array));
        System.out.print("Gia tri nho nhat trong mang tren la: ");
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
