package ss1_introduction_java.practice;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float weight;
        float height;
        float area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Weight Rectangle: ");
        weight = Float.parseFloat(scanner.nextLine());
        System.out.println("Input Height Rectangle: ");
        height = Float.parseFloat(scanner.nextLine());
        area = weight * height;
        System.out.println("Weight: "+ weight);
        System.out.println("Height: " + height);
        System.out.println("Area = " + area);
    }
}
