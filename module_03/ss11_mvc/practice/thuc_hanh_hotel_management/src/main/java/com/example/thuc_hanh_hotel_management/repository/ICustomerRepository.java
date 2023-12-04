package com.example.thuc_hanh_hotel_management.repository;

import com.example.thuc_hanh_hotel_management.model.Customer;

import java.util.List;


public interface ICustomerRepository {
    List<Customer> showList();

    void addCustomer(Customer customer);

    void editCustomer(int id,Customer customer);

    void removeCustomer(int id);

    Customer findById(int id);
}
