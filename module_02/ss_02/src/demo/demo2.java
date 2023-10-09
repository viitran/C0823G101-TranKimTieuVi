package demo;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a non-negative integer with up to 3 digits: ");
            int number = scanner.nextInt();

            if (number < 0 || number > 999) {
                System.out.println("So ban nhap khong hop le! Hay nhap so tu 0 -> 999");
            } else {
                int hundreds = number / 100;
                int tens = (number % 100) / 10;
                int ones = number % 10;

                System.out.print("In words: ");

                switch (hundreds) {
                    case 1:
                        System.out.print("one hundred");
                        break;
                    case 2:
                        System.out.print("two hundred");
                        break;
                    case 3:
                        System.out.print("three hundred");
                        break;
                    case 4:
                        System.out.print("four hundred");
                        break;
                    case 5:
                        System.out.print("five hundred");
                        break;
                    case 6:
                        System.out.print("six hundred");
                        break;
                    case 7:
                        System.out.print("seven hundred");
                        break;
                    case 8:
                        System.out.print("eight hundred");
                        break;
                    case 9:
                        System.out.print("nine hundred");
                        break;
                }

                // Add "and" if there are both hundreds and tens/ones
                if (hundreds > 0 && (tens > 0 || ones > 0)) {
                    System.out.print(" and ");
                }

                // Step 4: Read tens and ones for numbers greater than or equal to 20
                switch (tens) {
                    case 2:
                        System.out.print("twenty");
                        break;
                    case 3:
                        System.out.print("thirty");
                        break;
                    case 4:
                        System.out.print("forty");
                        break;
                    case 5:
                        System.out.print("fifty");
                        break;
                    case 6:
                        System.out.print("sixty");
                        break;
                    case 7:
                        System.out.print("seventy");
                        break;
                    case 8:
                        System.out.print("eighty");
                        break;
                    case 9:
                        System.out.print("ninety");
                        break;
                }

                // Read ones digit for numbers greater than or equal to 20
                switch (ones) {
                    case 1:
                        System.out.print(" one");
                        break;
                    case 2:
                        System.out.print(" two");
                        break;
                    case 3:
                        System.out.print(" three");
                        break;
                    case 4:
                        System.out.print(" four");
                        break;
                    case 5:
                        System.out.print(" five");
                        break;
                    case 6:
                        System.out.print(" six");
                        break;
                    case 7:
                        System.out.print(" seven");
                        break;
                    case 8:
                        System.out.print(" eight");
                        break;
                    case 9:
                        System.out.print(" nine");
                        break;
                }

                // Step 3: Read two-digit numbers less than 20
                if (tens == 1) {
                    switch (ones) {
                        case 0:
                            System.out.print(" ten");
                            break;
                        case 1:
                            System.out.print(" eleven");
                            break;
                        case 2:
                            System.out.print(" twelve");
                            break;
                        case 3:
                            System.out.print(" thirteen");
                            break;
                        case 4:
                            System.out.print(" fourteen");
                            break;
                        case 5:
                            System.out.print(" fifteen");
                            break;
                        case 6:
                            System.out.print(" sixteen");
                            break;
                        case 7:
                            System.out.print(" seventeen");
                            break;
                        case 8:
                            System.out.print(" eighteen");
                            break;
                        case 9:
                            System.out.print(" nineteen");
                            break;
                    }
                }

                System.out.println();
            }
        }
    }
}

