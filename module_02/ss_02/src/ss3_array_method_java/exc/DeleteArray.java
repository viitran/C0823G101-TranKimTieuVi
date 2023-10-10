package ss3_array_method_java.exc;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
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
        System.out.print("Mang cua ban la: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int number;
        System.out.print("Nhap so ban muon xoa trong mang tren: ");
        number = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                array[array.length - 1] = 0;
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("So ban muon xoa khong co trong mang tren!");
        } else {
            System.out.print("Mang sau khi xoa: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
