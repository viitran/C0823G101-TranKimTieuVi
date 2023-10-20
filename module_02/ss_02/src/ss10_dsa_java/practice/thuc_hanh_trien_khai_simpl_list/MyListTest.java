package ss10_dsa_java.practice.thuc_hanh_trien_khai_simpl_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 3: " + listInteger.get(3));

        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(9);
        listInteger.add(10);
        listInteger.add(11);
        listInteger.add(12);
        listInteger.add(13);
        listInteger.add(14);
        listInteger.add(15);
        System.out.println("element 2: " + listInteger.get(5));
        System.out.println("element 5: " + listInteger.get(6));
        System.out.println("element 7: " + listInteger.get(7));
        System.out.println("element 8: " + listInteger.get(8));
        System.out.println("element 9: " + listInteger.get(9));
        System.out.println("element 14: " + listInteger.get(14));
        System.out.println("element 10: " + listInteger.get(10));
        System.out.println("element 11: " + listInteger.get(11));
        System.out.println("element 11: " + listInteger.get(15));

    }
}
