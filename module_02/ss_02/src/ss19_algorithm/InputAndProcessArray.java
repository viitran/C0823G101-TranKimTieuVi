package ss19_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InputAndProcessArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void inputAndProcess() {
        int size;
        int[] arr;
        System.out.print("nhập độ dài của mảng: ");
        size = check();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ a[" + i + "]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
    }

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
}

