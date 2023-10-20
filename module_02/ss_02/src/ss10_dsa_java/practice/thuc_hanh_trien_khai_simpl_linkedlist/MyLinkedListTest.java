package ss10_dsa_java.practice.thuc_hanh_trien_khai_simpl_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(10);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.addFirst(8);
        list.addFirst(9);
        list.addFirst(10);

        list.add(13,6);
        list.printList();
    }
}
