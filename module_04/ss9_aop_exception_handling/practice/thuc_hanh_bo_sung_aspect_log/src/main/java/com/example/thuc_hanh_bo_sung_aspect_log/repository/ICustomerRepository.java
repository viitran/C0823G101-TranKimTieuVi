package com.example.thuc_hanh_bo_sung_aspect_log.repository;

import com.example.thuc_hanh_bo_sung_aspect_log.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
}
