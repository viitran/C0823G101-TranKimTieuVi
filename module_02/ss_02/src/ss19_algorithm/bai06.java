package ss19_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int size;
        int[] array;
        System.out.println("Nhập độ dài cuả mảng: ");
        size = Integer.parseInt(scanner.nextLine());
        if (size < 0) {
            System.out.println("Độ dài của mảng là số nguyên dương!Nhập lại độ dài của mảng: ");
            size = Integer.parseInt(scanner.nextLine());
        }

        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ a[" + i + "]: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng của bạn là: " + Arrays.toString(array));

        System.out.print("Nhập số bất kì: ");
        number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length -1; j++) {
                if (array[i] + array[j] == number) {
                    System.out.println("vị trí thứ " + i + " và vị trí thứ " + j + " trong mảng có tổng bằng " + number);
                }
            }
        }
    }
}
