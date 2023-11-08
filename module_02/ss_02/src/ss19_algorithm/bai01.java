package ss19_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class bai01 {
    private static Scanner scanner = new Scanner(System.in);

    private static int check() {
        int value = 0;
        boolean check = false;
        do {
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value > 0) {
                    check = true;
                } else {
                    System.out.print("độ dài phải lớn hơn 0.Nhập lại: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Nhập số!Nhập lại: ");
            }
        } while (!check);
        return value;
    }

    private static void inputArray() {
        int size;
        int[] arr;
        int count = 0;
        int counts = 0;
        System.out.print("nhập độ dài của mảng: ");
        size = check();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ a[" + i + "]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            } else {
                counts++;
            }
        }
        if (count == counts){
            System.out.println("Ok");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        inputArray();
    }
}
