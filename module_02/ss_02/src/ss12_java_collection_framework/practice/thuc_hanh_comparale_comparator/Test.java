package ss12_java_collection_framework.practice.thuc_hanh_comparale_comparator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student = new Student("Vtran", 13, "DN");
        Student student1 = new Student("abc", 13, "HN");
        Student student2 = new Student("Bao", 17, "SG");
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        Collections.sort(studentList);
        for (Student std : studentList) {
            System.out.println(std.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList, ageComparator);
        for (Student stds : studentList) {
            System.out.println(stds);
        }
    }
}
