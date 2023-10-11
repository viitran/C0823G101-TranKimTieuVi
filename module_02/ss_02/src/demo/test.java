package demo;

public class test {
    public static void main(String[] args) {
        int h = 5;
        for (int i = 0; i < h; i++) {
            System.out.println();
            for (int j = 0; j < h; j++) {
                if ( i == h - 1 || i + j >= h  ) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
