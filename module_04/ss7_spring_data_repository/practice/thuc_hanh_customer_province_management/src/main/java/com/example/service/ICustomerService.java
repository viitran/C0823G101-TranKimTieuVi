package com.example.service;

import com.example.model.Customer;
import com.example.model.Province;

public interface ICustomerService extends IGenerateService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
