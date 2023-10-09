package ss1_introduction_java.exc;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        double vnd;
        System.out.println("Chuyen doi tien USD sang VND");
        System.out.println("1$ = 23000VND");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien (USD) ban muon doi sang VND: ");
        usd = Double.parseDouble(scanner.nextLine());
        vnd = usd * rate;
        System.out.println("So tien ban muon doi: " + usd + "$");
        System.out.println("Chuyen doi tu " + vnd + "$ " + "thanh " + vnd + "VND");
    }
}
