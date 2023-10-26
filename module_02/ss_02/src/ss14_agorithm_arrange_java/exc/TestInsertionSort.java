package ss14_agorithm_arrange_java.exc;

import java.util.Arrays;

public class TestInsertionSort {
    public static void main(String[] args) {
        int[] array = {3, 0, 7, 5, 8, 1};
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));
        System.out.println("----------------");
        insertionSort(array);
    }

    private static void insertionSort(int[] array) {
        int key;
        int element;
        for (int i = 1; i < array.length; i++) {
            element = array[i];
            key = i;
            while (key > 0 && element < array[key - 1]) {
                array[key] = array[key - 1];
                key--;
            }
            array[key] = element;
            System.out.println("giá trị được chọn " + element + " vị trí sau khi đổi " + key);
            System.out.println("Bước " + (i + 1) + ": " + Arrays.toString(array));
        }
    }
}
