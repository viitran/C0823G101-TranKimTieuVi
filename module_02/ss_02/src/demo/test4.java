package demo;


import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

public class test4 {
public static void main(String[] args) {
    String str = "CodegymDaNang";
    StringBuilder correctedString = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        char currentChar = str.charAt(i);

        if (Character.isUpperCase(currentChar)) {
            if (i > 0) {
                correctedString.append(' ');
            }
            correctedString.append(Character.toLowerCase(currentChar));
        } else {
            correctedString.append(currentChar);
        }
    }

    System.out.println(correctedString.toString());
}

}
