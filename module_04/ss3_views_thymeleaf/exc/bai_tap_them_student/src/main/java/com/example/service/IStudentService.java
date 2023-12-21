package com.example.service;

import com.example.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> showList();
    void addNew(Student student);
    Student findById(int id);
    void remove(int id);
    void update(int id,Student student);
    List<Student> sortByAge();
}
