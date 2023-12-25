package com.example.service;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import com.example.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Override
    public List<Customer> showList() {
        return iCustomerRepository.showList();
    }
}
