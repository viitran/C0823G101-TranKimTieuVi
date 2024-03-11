package com.example.back_end.controller;

import com.example.back_end.model.Customer.CustomerType;
import com.example.back_end.repository.cust.ICustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CustomerTypeController {
    @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;

    @GetMapping("/customer-type")
    public ResponseEntity<List<CustomerType>> findAllCustomerType() {
        return new ResponseEntity<>(this.iCustomerTypeRepository.findAll(), HttpStatus.OK);
    }
}
