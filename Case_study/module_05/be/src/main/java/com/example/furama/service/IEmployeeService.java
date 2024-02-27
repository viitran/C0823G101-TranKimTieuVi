package com.example.furama.service;


import com.example.furama.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<Employee> findAll();
    void save(Employee employee);
    Optional<Employee> findById(Integer id);
    void deleteById(Integer id);
}
