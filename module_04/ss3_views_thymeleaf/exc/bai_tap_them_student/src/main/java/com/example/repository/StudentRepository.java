package com.example.repository;

import com.example.model.Student;
import com.example.utils.AgeArrange;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> list = new LinkedList<>();

    static {
        list.add(new Student(1, "Vi Trần", "Nữ", 19, "o nha"));
        list.add(new Student(2, "Phương TD", "Nam", 24, "CodeGym Da Nang"));
        list.add(new Student(3, "Bảo Le", "Nam", 22, "Hue mong mo"));
        list.add(new Student(4, "Trúc Vi", "Nữ", 18, "Quang nam"));
    }

    @Override
    public List<Student> showList() {
        return list;
    }

    @Override
    public void addNew(Student student) {
        list.add(student);
    }

    @Override
    public Student findById(int id) {
        for (Student s : list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void remove(int id) {
        for (Student s : list) {
            if (s.getId() == id) {
                list.remove(s);
                break;
            }
        }
    }

    @Override
    public void update(int id, Student student) {
        for (Student s : list) {
            if (s.getId() == id) {
                s.setName(student.getName());
                s.setGender(student.getGender());
                s.setAge(student.getAge());
                s.setAddress(student.getAddress());
                break;
            }
        }
    }

    @Override
    public List<Student> sortByAge() {
        Collections.sort(list, new AgeArrange());
        return list;
    }
}
