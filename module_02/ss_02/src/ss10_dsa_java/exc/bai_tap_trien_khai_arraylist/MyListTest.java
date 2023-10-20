package ss10_dsa_java.exc.bai_tap_trien_khai_arraylist;

public class MyListTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Penguin");
        Student student1 = new Student(2, "Vtran");
        Student student2 = new Student(3, "KaraKii");
        Student student3 = new Student(4, "Latiah");
        MyList<Student> myList = new MyList<>();
        myList.add(student);
        myList.add(student1);
        myList.add(student2);
        myList.add(student3);
        myList.printList();
        System.out.println("------------------");
        myList.remove(0);
        myList.printList();
    }
}
