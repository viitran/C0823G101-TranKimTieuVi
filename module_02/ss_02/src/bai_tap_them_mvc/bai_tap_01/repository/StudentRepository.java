package bai_tap_them_mvc.bai_tap_01.repository;


import bai_tap_them_mvc.bai_tap_01.model.Student;

public class StudentRepository implements IStudentRepository {
    private static Student[] students = new Student[10];

    static {
        students[0] = new Student(1, "Dụng");
        students[1] = new Student(2, "Tuấn");
        students[2] = new Student(3, "Vi");
        students[3] = new Student(4, "Độ");
        students[4] = new Student(5, "Hải");
    }

    @Override
    public void showList() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

//    @Override
//    public void addStudent() {
//
//    }

    //    @Override
//    public void deleteStudent(int index) {
//        for (int i = 0; i < students.length; i++) {
//            if (students[index] != students[i]) {
//
//            }
//        }
//    }
}
