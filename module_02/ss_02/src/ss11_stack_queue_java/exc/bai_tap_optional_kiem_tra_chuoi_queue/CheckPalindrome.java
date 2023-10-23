package ss11_stack_queue_java.exc.bai_tap_optional_kiem_tra_chuoi_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class CheckPalindrome {
    public static void main(String[] args) {
        int size;
        Queue<String> stringQueue = new ArrayDeque<>();
        String string = "Able was I ere I saw Elba";
        size = string.length();
        String stringEmpty = "";
        for (int i = size - 1; i >= 0; i--) {
            stringEmpty += string.charAt(i);
        }

        stringQueue.add(stringEmpty);
        System.out.print("Before Palindrome: ");
        System.out.println(stringQueue);

        if (string.equalsIgnoreCase(stringEmpty)) {
            System.out.println("After Palindrome: " + string + " is palindrome");
        } else {
            System.out.println(string + " isn't palindrome!");
        }
    }
}
