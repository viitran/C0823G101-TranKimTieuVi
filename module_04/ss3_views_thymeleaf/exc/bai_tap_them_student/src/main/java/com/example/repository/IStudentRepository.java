package com.example.repository;


import com.example.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> showList();
    void addNew(Student student);
    Student findById(int id);
    void remove(int id);
    void update(int id,Student student);
    List<Student> sortByAge();
}
