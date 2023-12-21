package com.example.utils;

import com.example.model.Student;

import java.util.Comparator;

public class AgeArrange implements Comparator<Student> {

    @Override
    public int compare(Student t1, Student t2) {
        if (t2.getAge() > t1.getAge()) {
            return 1;
        } else if (t2.getAge() == t1.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }
}
