package com.example.back_end.controller;

import com.example.back_end.model.Customer.Customer;
import com.example.back_end.model.Employee.Employee;
import com.example.back_end.repository.cust.ICustomerRepository;
import com.example.back_end.repository.empl.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonRestController {

    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> findAllHouse() {
        List<Employee> list = this.iEmployeeRepository.findAllEmp();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        return new ResponseEntity<>(this.iEmployeeRepository.save(employee), HttpStatus.CREATED);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> findByIdEmpl(@PathVariable int id) {
        Employee employeeId = this.iEmployeeRepository.findIdEmployee(id);
        return new ResponseEntity<>(employeeId, HttpStatus.OK);
    }

    @PostMapping("/edit")
    public ResponseEntity<?> update(@RequestBody Employee employee) {
        return new ResponseEntity<>(this.iEmployeeRepository.save(employee), HttpStatus.OK);
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<?> remove(@PathVariable int id) {
        this.iEmployeeRepository.removeById(id);
        this.iCustomerRepository.removeCustomerById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> findAllCustomer() {
        return new ResponseEntity<>(this.iCustomerRepository.findAllCus(), HttpStatus.OK);
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> findByIdCus (@PathVariable int id){
        return new ResponseEntity<>(this.iCustomerRepository.findIdCustomer(id), HttpStatus.OK);
    }

    @PostMapping("/create-customer")
    public ResponseEntity<Customer> create (@RequestBody Customer customer){
        return new ResponseEntity<>(this.iCustomerRepository.save(customer),HttpStatus.OK);
    }

    @PostMapping("/edit-customer")
    public ResponseEntity<?> updateCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(this.iCustomerRepository.save(customer),HttpStatus.OK);
    }

}
