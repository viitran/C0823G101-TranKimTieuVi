package com.example.cart.service;


import com.example.cart.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    void save(Product product);

    Optional<Product> findById(Long id);

    List<Product> findAll();

    void delete(Long id);

    Page<Product> findAllPage(Pageable pageable);
}