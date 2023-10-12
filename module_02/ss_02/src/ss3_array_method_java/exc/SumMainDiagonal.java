package ss3_array_method_java.exc;

import java.util.Arrays;
import java.util.Scanner;

public interface SumMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix;
        int row;
        int col;
        int sum = 0;
        System.out.print("Nhap so cot: ");
        row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so hang: ");
        col = Integer.parseInt(scanner.nextLine());
        matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("Nhap phan tu thu [" + i + "][" + j + "]: ");
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mang ban dau: " + Arrays.deepToString(matrix));
        System.out.print("Tong duong cheo chinh cua mang tren: ");
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.print(sum);
    }
    //note! chu y toi uu lai vong lap
}
