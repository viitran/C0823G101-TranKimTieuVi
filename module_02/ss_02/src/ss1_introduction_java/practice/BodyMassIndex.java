package ss1_introduction_java.practice;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        float weight, height, bmi;
        System.out.println("Tinh chi so BMI cua co the");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Weight (Kg): ");
        weight = Float.parseFloat(scanner.nextLine());
        System.out.println("Input Height (m): ");
        height = Float.parseFloat(scanner.nextLine());
        bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("chi so can nang(BMI) cua ban la " + bmi + ", ban dang thieu can!");
        } else if (bmi < 25.0) {
            System.out.println("chi so can nang(BMI) cua ban la " + bmi + ", ban dang binh thuong!");
        } else if (bmi < 30.0) {
            System.out.println("chi so can nang(BMI) cua ban la " + bmi + ", ban dang hoi du can!");
        } else {
            System.out.println("chi so can nang(BMI) cua ban la " + bmi + ", ban dang qua la du can!");
        }
        System.out.println("Weight = " + weight + " Kg");
        System.out.println("Height = " + height + " m");
        System.out.println("Ket qua BMI cua ban la: "+ bmi);
    }
}
