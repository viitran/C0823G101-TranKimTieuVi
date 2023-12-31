package ss3_array_method_java.exc;

import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        int[] newArray;
        int inputNumber;
        int inputElement;
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
        for (int k : array) {
            System.out.print(k + " ");
        }

        System.out.print("Nhap so ban muon them: ");
        inputNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap vi tri muon chen: ");
        inputElement = Integer.parseInt(scanner.nextLine());

        if (inputElement < 0 || inputElement > array.length) {
            System.out.println("Vi tri chen khong hop le!!");
        } else {
            newArray = new int[array.length + 1];
            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == inputElement) {
                    newArray[i] = inputNumber;
                } else {
                    newArray[i] = array[j];
                    j++;
                }
            }
            //upd lai mang
            array = newArray;
            System.out.print("Mang sau khi chen la: ");
            for (int j : array) {
                System.out.print(j + " ");
            }
        }
    }
}
