package com.example.thuc_hanh_hotel_management.service;

import com.example.thuc_hanh_hotel_management.model.Customer;
import com.example.thuc_hanh_hotel_management.repository.CustomerRepository;
import com.example.thuc_hanh_hotel_management.repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {

    private static ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public List<Customer> showList() {
        return iCustomerRepository.showList();
    }

    @Override
    public void addCustomer(Customer customer) {
        iCustomerRepository.addCustomer(customer);
    }

    @Override
    public void editCustomer(int id, Customer customer) {
        iCustomerRepository.editCustomer(id,customer);
    }

    @Override
    public Customer findById(int id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void removeCustomer(int id) {
        iCustomerRepository.removeCustomer(id);
    }
}
