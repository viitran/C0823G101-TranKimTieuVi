package ss12_java_collection_framework.practice.thuc_hanh_phan_biet_hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Vi", 17, "Sao hoả");
        Student student2 = new Student("Vi Trần", 13, "Sao Kim");
        System.out.println("Map");
        HashMap<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        System.out.println(studentMap);
        System.out.println("-----Set-----");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        for (Student std: studentSet) {
            System.out.println(std);
        }
    }

}
