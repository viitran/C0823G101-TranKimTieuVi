//package bai_tap_them_mvc.bai_tap_01.repository;
//
//
//import bai_tap_them_mvc.bai_tap_01.model.Student;
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class StudentRepository implements IStudentRepository {
//    private static List<Student> students = new LinkedList<>();
//
//    static {
//        students.add(new Student(1, "VTran"));
//        students.add(new Student(2, "Latiah"));
//        students.add(new Student(3, "Alina"));
//    }
//
//    @Override
//    public void showList() {
//        for (Student s : students) {
//            System.out.println(s);
//        }
//    }
//
//    @Override
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    @Override
//    public Boolean deleteStudent(int id) {
//        for (Student stds : students) {
//            if (stds.getId() == id) {
//                students.remove(stds);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public Student checkId(int id) {
//        for (Student student : students) {
//            if (student.getId() == id) {
//                return student;
//            }
//        }
//        return null;
//    }
//
//
//}