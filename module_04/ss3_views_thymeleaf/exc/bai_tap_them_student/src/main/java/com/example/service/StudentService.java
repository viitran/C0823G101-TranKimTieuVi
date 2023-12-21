package com.example.service;

import com.example.model.Student;
import com.example.repository.IStudentRepository;
import com.example.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService{
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public List<Student> showList() {
        return iStudentRepository.showList();
    }

    @Override
    public void addNew(Student student) {
        iStudentRepository.addNew(student);
    }

    @Override
    public Student findById(int id) {
        return iStudentRepository.findById(id);
    }

    @Override
    public void remove(int id) {
         iStudentRepository.remove(id);
    }

    @Override
    public void update(int id, Student student) {
        iStudentRepository.update(id,student);
    }

    @Override
    public List<Student> sortByAge() {
      return   iStudentRepository.sortByAge();
    }
}
