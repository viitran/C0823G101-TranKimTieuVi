package ss3_array_method_java.exc;

import java.util.Scanner;

public class CountOccurrencesInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "CodeGym Da Nang";
        boolean check = false;
        int count = 0;
        String characters;
        System.out.println("Chuoi mac dinh: " + str);
        System.out.print("Nhap ki tu ban muon dem so lan xuat hien o chuoi tren: ");
        characters = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (characters.charAt(0) == str.charAt(i)) {
                check = true;
                count++;
            }
        }
        if (!check) {
            System.out.println("Ki tu ban can tim khong co trong chuoi tren");
        } else {
            System.out.println("Ki tu ban can tim xuat hien " + count + " lan");
        }
    }
}
