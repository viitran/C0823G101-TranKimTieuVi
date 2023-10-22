package ss10_dsa_java.exc.bai_tap_trien_khai_linkedlist;


public class MyLinkedListTest {
    public static void main(String[] args) {
        People people1 = new People("Vi Trần", 14);
        People people2 = new People("HN", 13);
        People people3 = new People("N.Bao", 18);
        People people4 = new People("N.Huy", 30);
        MyLinkedList<People> myLinkedListPeople = new MyLinkedList<>();
        myLinkedListPeople.add(0, people1);
        myLinkedListPeople.add(1, people4);
        myLinkedListPeople.add(2, people3);
        myLinkedListPeople.add(3, people2);
        for (int i = 0; i < myLinkedListPeople.size(); i++) {
            People pp = myLinkedListPeople.get(i);
            System.out.println(pp.toString());
        }
        System.out.println("---------------");
        myLinkedListPeople.remove(1);
        for (int i = 0; i < myLinkedListPeople.size(); i++) {
            People pp = myLinkedListPeople.get(i);
            System.out.println(pp.toString());
        }

    }
}
