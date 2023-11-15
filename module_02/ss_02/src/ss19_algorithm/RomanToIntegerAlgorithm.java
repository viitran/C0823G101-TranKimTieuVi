package ss19_algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToIntegerAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sô la mã");
        String roman = scanner.nextLine();
        int result = romanToInt(roman);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentNumeral = romanNumerals.get(s.charAt(i));
            if (i < s.length() - 1 && currentNumeral < romanNumerals.get(s.charAt(i + 1))) {
                result -= currentNumeral;
            } else {
                result += currentNumeral;
            }
        }
        return result;
    }
}
