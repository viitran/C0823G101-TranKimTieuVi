package demo;

public class test {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            System.out.print(i);

            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print(" ");
            }

            if (i >= 1) {
                System.out.print(i);
            }

            System.out.println();
        }
        for(int i = n;i >= 1;i--){
            for(int j = n - i;j>=1;j--){
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 2 * i - 2; j >=1; j--) {
                System.out.print(" ");
            }
            if(i >= 1){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
