package ss3_array_method_java.exc;

public class FindElementArray {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[5][3];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
                System.out.print("[" + matrix[row][column] + "]" + " ");
            }
            System.out.println();
        }

        System.out.println("Phan tu lon nhat trong mang 2 chieu tren la");
    }
}
