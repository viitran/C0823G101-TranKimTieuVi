package ss2_loop_java.exc;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1;
        int height;
        int width;
        System.out.println("Menu: ");
        System.out.println("1. Vẽ hình chữ nhật (Chiều rộng sẽ được nhân 2)");
        System.out.println("2. Vẽ hình tam giác vuông");
        System.out.println("3. Vẽ hình tam giác cân");
        System.out.println("4.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lựa chọn của bạn là: ");
        choice = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chiều cao của hình bạn chọn: ");
        height = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chiều rộng của hình bạn chọn: ");
        width = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Hình chữ nhật có H = " + height + " và W = " + width * 2 + " là: ");
                for (int i = 0; i < height; i++) {
                    System.out.printf("\n   ");
                    for (int j = 0; j < width * 2; j++) {
                        if (i + j >= height || j - i <= height) {
                            System.out.print("\t *");
                        } else {
                            System.out.printf("\t");
                        }
                    }
                }
                break;
            case 2:
                System.out.println("Hình tam giác vuông có H = " + height + " là: ");
                for (int i = 0; i < height; i++) {
                    System.out.println();
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 3:
                System.out.println("Hình tam giác cân có H = " + height + " là: ");
                for (int i = 0; i < height; i++) {
                    System.out.printf("\n");
                    for (int j = 0; j <= height * 2; j++) {
                        if (i == height || i + j >= height && j - i <= height) {
                            System.out.print("*");
                        } else {
                            System.out.printf(" ");
                        }
                    }
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Số bạn nhập không hợp lệ!");
                break;
        }
    }
}

