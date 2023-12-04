package com.example.thuc_hanh_hotel_management.service;

import com.example.thuc_hanh_hotel_management.model.Customer;

import java.util.List;


public interface ICustomerService {
    List<Customer> showList();

    void addCustomer(Customer customer);

    void removeCustomer(int id);

    void editCustomer(int id,Customer customer);

    Customer findById(int id);
}
