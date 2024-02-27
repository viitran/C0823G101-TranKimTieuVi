package com.example.furama.controller;

import com.example.furama.model.Employee;
import com.example.furama.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/public")
public class EmpolyeeRestController{
    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping("/aa")
    public ResponseEntity<List<Employee>> getAll(){
        List<Employee> list = iEmployeeService.findAll();
        System.out.println(list.size());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
