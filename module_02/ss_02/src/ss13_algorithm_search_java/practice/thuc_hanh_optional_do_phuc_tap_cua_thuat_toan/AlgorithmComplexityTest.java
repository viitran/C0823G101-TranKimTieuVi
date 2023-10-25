package ss13_algorithm_search_java.practice.thuc_hanh_optional_do_phuc_tap_cua_thuat_toan;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] frequentCharacter = new int[255];
        int ascii;
        int max = 0;
        System.out.println("Nhập chuỗi: ");
        String inputString = scanner.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            ascii = inputString.charAt(i);
            frequentCharacter[ascii] += 1;
        }
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (frequentCharacter[i] > max){
                max = frequentCharacter[i];
                character = (char) i;
            }
        }
        System.out.println("Ký tự " + character + " xuất hiện nhiều nhất trong chuỗi " + max + " lần");
    }

}
