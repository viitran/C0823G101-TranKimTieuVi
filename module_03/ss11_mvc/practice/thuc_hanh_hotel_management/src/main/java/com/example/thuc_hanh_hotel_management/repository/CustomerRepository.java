package com.example.thuc_hanh_hotel_management.repository;

import com.example.thuc_hanh_hotel_management.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1, "Nguyen Van A", "nguyenvana@gmail.com", "Ha Noi"));
        customers.add(new Customer(2, "Nguyen Van B", "bnguyen_123@gmail.com", "TP HCM"));
        customers.add(new Customer(3, "Tran Thi C", "ctran@gmail.com", "Da Nang"));
    }

    @Override
    public List<Customer> showList() {
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void editCustomer(int id, Customer customer) {
        if (customers.get(id).equals(id)){

        }
    }

    @Override
    public void removeCustomer(int id) {
        customers.remove(id);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }
}
