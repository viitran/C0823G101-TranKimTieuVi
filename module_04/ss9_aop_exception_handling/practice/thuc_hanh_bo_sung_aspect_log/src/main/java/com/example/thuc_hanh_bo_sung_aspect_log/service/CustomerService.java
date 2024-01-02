package com.example.thuc_hanh_bo_sung_aspect_log.service;

import com.example.thuc_hanh_bo_sung_aspect_log.model.Customer;
import com.example.thuc_hanh_bo_sung_aspect_log.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Override
    public Iterable<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        iCustomerRepository.deleteById(id);
    }
}
