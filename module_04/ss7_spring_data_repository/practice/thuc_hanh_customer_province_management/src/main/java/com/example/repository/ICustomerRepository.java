package com.example.repository;

import com.example.model.Customer;
import com.example.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer,Integer> {
    Iterable<Customer> findAllByProvince(Province province);
}
