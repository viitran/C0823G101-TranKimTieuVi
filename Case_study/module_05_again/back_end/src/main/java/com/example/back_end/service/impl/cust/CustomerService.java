package com.example.back_end.service.impl.cust;

import com.example.back_end.model.Customer.Customer;
import com.example.back_end.repository.cust.ICustomerRepository;
import com.example.back_end.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Override
    public List<Customer> findAll() {
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
    public void remove(Integer id) {
        iCustomerRepository.deleteById(id);
    }
}
