package ss3_array_method_java.exc;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        System.out.println("Nhap do dai cua mang");
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
        System.out.println("Nhap so ban muon xoa trong mang tren: ");
        number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (number !=  array[j]){
                    System.out.println("So ban muon xoa khong co trong mang tren!");
                    break;
                }
                else {
                    System.out.println("Phan tu ban muon xoa dang nam o vi tri: " + (array[j] - 1));
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
