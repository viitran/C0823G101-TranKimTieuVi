package ss11_stack_queue_java.exc.bai_tap_dem_so_lan_xuat_hien_trong_moi_tu_trong_string_map;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        int count;
        String string = "hhhhoooooooooocccsinhhhhhhhhhhhhhh";
        String lowerCaseString = string.toLowerCase();
        String[] arrayWord = lowerCaseString.split("");

        TreeMap<String, Integer> wordCount = new TreeMap<>();
        for (String word : arrayWord) {
            if (wordCount.containsKey(word)) {
                count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for (String word : wordCount.keySet()) {
            count = wordCount.get(word);
            System.out.println("Từ " + word + " xuất hiện " + ": " + count);
        }
    }
}
