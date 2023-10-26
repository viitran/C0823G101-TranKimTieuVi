package ss14_agorithm_arrange_java.exc;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {12, 2, 8, 5, 1, 6, 4, 15};
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
        }
        System.out.println(Arrays.toString(array));
    }
}
