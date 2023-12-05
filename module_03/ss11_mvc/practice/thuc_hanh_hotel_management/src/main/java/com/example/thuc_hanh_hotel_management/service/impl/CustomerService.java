package com.example.thuc_hanh_hotel_management.service.impl;

import com.example.thuc_hanh_hotel_management.model.Customer;
import com.example.thuc_hanh_hotel_management.repository.impl.CustomerRepository;
import com.example.thuc_hanh_hotel_management.repository.ICustomerRepository;
import com.example.thuc_hanh_hotel_management.service.ICustomerService;

import java.util.List;

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
