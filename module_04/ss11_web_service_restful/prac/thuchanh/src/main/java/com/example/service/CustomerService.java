package com.example.service;


import com.example.repository.ICustomerRepository;
import com.example.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Override
    public Iterable<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
       return iCustomerRepository.save(customer);
    }

    @Override
    public void deleteById(Integer id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return iCustomerRepository.findById(id);
    }
}
