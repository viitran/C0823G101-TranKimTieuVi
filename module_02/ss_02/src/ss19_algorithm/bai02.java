package ss19_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class bai02 {
    private static Scanner scanner = new Scanner(System.in);

    public static void inputAndProcess() {
        int size;
        int[] arr;
        boolean flag = false;
        System.out.print("nhập độ dài của mảng: ");
        size = check();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ a[" + i + "]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= arr.length / 2; i++) {
            for (int j = arr.length / 2; j < arr.length; j++) {
                if (arr[i] * i == arr[j]) {
                    flag = true;
                }
            }
        }
        flag = false;
        if (!flag) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        inputAndProcess();
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
