package demo;

public class SportCars {

    static class Student {
        int rollno;  //biến instance
        String name;
        static String college = "ITS";  //biến static

        //constructor
        Student(int r, String n) {
            rollno = r;
            name = n;
        }

        //phương thức để hiển thị giá trị
        void display() {
            System.out.println(rollno + " " + name + " " + college);
        }
    }
}

//    public static void main(Country[] args) {
////        int [] number = {1,2,3,4,5,6,7};
////        for (int i = 0; i<number.length ; i++) {
////            System.out.print(number[i]);
////        }
//        int[][] matrix = new int[5][5];
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = input.nextInt();
//            }
//        }
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = (int) (Math.random() * 100);
//                total += matrix[row][column];
//                System.out.print("["+matrix[row][column]+"]"+ " ");
//            }
//            System.out.println();
//        }
//        System.out.println(total);
//    }
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                System.out.print(matrix[row][column] + " ");
//            }
//            System.out.println();
//        }
//    }
//        for (int column = 0; column < matrix[0].length; column++) {
//            int total = 0;
//            for (int row = 0; row < matrix.length; row++)
//            total += matrix[row][column];
//            System.out.println("Sum for column " + column + " is " + total);
//        }
//    }
//}
//tim dong co tong cac phan tu lon nhat
//        int maxRow = 0;
//        int indexOfMaxRow = 0;
//        for (int column = 0; column < matrix[0].length; column++) {
//            maxRow += matrix[0][column];
//        }
//        for (int row = 1; row < matrix.length; row++) {
//            int totalOfThisRow = 0;
//            for (int column = 0; column < matrix[row].length; column++)
//                totalOfThisRow += matrix[row][column];
//            if (totalOfThisRow > maxRow) {
//                maxRow = totalOfThisRow;
//                indexOfMaxRow = row;
//            }
//        }
//        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
//    }
//xao tron mang
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                int i1 = (int) (Math.random() * matrix.length);
//                int j1 = (int) (Math.random() * matrix[i].length);
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[i1][j1];
//                matrix[i1][j1] = temp;
//            }
//        }
//    }

//        public class Test1 {
//            static {
//                System.out.println("Static");
//            }
//            {
//                System.out.println("Instance");
//            }
//            public void Test1() {
//                System.out.println("Constructor");
//            }
//            public void main(Country[] args) {
//                Test1 t = new Test1();
//            }
//        }
//    }
