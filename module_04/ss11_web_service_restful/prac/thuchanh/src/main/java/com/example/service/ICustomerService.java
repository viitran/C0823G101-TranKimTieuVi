package com.example.service;


import com.example.model.Customer;

import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> findAll();
    Customer save(Customer customer);
    void deleteById(Integer id);
    Optional<Customer> findById(Integer id);

}
