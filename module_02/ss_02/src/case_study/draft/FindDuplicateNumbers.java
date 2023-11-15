package case_study.draft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
       char[] a = {'a','b','c','b','d','c','e','f'};
       int count = 0;
       String str = String.copyValueOf(a);
       String[] b = str.split("");
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - 1; j++) {
                if (b[i].equals(b[j])){
                    count++;
                    System.out.println(b[j]);
                }
            }

        }
//        System.out.println(Arrays.toString(b));

    }
}
