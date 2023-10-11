package ss3_array_method_java.exc;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix;
        int row;
        int col;
        int max = 0;
        System.out.print("Nhap chieu dai cua mang: ");
        row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap chieu rong cua mang: ");
        col = Integer.parseInt(scanner.nextLine());
        matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Nhap phan tu thu [" + i + "][" + j + "]: ");
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mang co kich thuoc " + row + "x" + col + " la: " + Arrays.deepToString(matrix));
        System.out.print("Phan tu lon nhat trong mang tren la: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
