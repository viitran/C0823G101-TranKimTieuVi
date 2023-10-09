package ss1_introduction_java.exc;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Your Name: ");
        name = scanner.nextLine();
        System.out.println("Hello be " + name);
    }
}
