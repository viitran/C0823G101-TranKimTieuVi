package ss19_algorithm;

import java.util.Scanner;

public class bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number decimal convert to octal: ");
        int decimal = Integer.parseInt(scanner.nextLine());
        int octal = convertDecimalToOctal(decimal);
        System.out.println(decimal + "decimal = " + octal + "octal");
    }

    public static int convertDecimalToOctal(int decimal) {
        int octalNumber = 0;
        int i = 1;
        while (decimal != 0) {
            octalNumber = octalNumber + (decimal % 8) * i;
            decimal = decimal / 8;
            i = i * 10;
        }
        return octalNumber;
    }
}
