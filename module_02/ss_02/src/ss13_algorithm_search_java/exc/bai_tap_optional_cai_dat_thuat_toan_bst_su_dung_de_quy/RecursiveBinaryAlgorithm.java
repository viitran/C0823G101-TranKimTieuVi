package ss13_algorithm_search_java.exc.bai_tap_optional_cai_dat_thuat_toan_bst_su_dung_de_quy;

import java.util.*;

public class RecursiveBinaryAlgorithm {
    public static void main(String[] args) {

        int[] array;
        int size;
        int searchValue;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của màng: ");
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ [" + i + "]: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng ban đầu " + Arrays.toString(array));
        System.out.println("Mảng sau khi sắp xếp: ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập số cần tìm trong mảng: ");
        searchValue = Integer.parseInt(scanner.nextLine());
        System.out.println("Số cần tìm trong mảng nằm ở vị trí:  " + binarySearch(array, 0, array.length - 1, searchValue));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            } else if (value < array[middle]) {
                return binarySearch(array, left, middle - 1, value);
            }
        }
        return -1;
    }
}
