package ss19_algorithm;

public class test {
    public static void main(String[] args) {
        int[] a = {2,4,1,3};
        for (int i = 0; i <= a.length; i++) {
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
    }
}
