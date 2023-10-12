package ss3_array_method_java.exc;

import java.util.Arrays;
import java.util.Scanner;

public class ColumnSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix;
        int total = 0;
        int row;
        int column;
        int number;
        System.out.print("Nhap so hang mang: ");
        row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so cot mang: ");
        column = Integer.parseInt(scanner.nextLine());
        matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Nhap phan tu thu [" + i + "][" + j + "]: ");
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mang: " + Arrays.deepToString(matrix));
        System.out.print("Nhap cot muon tinh tong: ");
        number = Integer.parseInt(scanner.nextLine());
        if (number >= matrix[0].length) {
            System.out.println("Khong co cot ban muon tinh tong!");
        } else {
            for (int i = 0; i < matrix[0].length; i++) {
                total += matrix[i][number];
            }
        }
        System.out.println("Tong cac so o cot " + number + " la " + total);
    }
}