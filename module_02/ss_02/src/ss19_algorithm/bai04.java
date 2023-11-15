package ss19_algorithm;

import java.util.Arrays;

public class bai04 {
    public static void main(String[] args) {
        String str1 = "11:20:30";
        String str2 = "07:35:45";
        sumNumber(str1, str2);
    }

    private static void sumNumber(String str1, String str2) {
        String[] arr1 = str1.split(":");
        String[] arr2 = str2.split(":");
        int size = arr1.length;
        int[] strings2 = new int[size];
        int a;
        int b;
        int sum;
        for (int i = 0; i < strings2.length; i++) {
            a = Integer.parseInt(arr1[i]);
            b = Integer.parseInt(arr2[i]);
            sum = a + b;
            strings2[i] = sum;
        }
        System.out.println(strings2[0] + ":" + strings2[1] + ":" + strings2[2]);
    }
}
