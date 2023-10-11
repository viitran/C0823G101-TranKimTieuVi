package ss3_array_method_java.exc;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        int number;
        int[] newArray;
        int index = 0;

        System.out.print("Nhap do dai cua mang: ");
        size = Integer.parseInt(scanner.nextLine());
        if (size < 0) {
            System.out.println("Do dai cua mang khong duoc am!");
            System.out.println("Nhap lai do dai cua mang");
            size = Integer.parseInt(scanner.nextLine());
        }
        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu thu [" + i + "]: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mang cua ban la: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        newArray = new int[size];
        System.out.println("Nhap so ban muon xoa trong mang tren: ");
        number = Integer.parseInt(scanner.nextLine());
        for (int k : array) {
            if (number != k) {
                newArray[index] = k;
                index++;
            }
        }
        System.out.println("Mang sau khi da xoa phan tu" + number + "la: ");
        for (int j : newArray) {
            System.out.println(j + " ");
        }
    }
}
