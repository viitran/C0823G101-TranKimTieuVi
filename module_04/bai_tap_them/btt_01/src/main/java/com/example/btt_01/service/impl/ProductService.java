package com.example.btt_01.service.impl;

import com.example.btt_01.model.Product;
import com.example.btt_01.repository.IProductRepository;
import com.example.btt_01.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;


    @Override
    public Iterable<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        iProductRepository.deleteById(id);
    }

    @Override
    public Page<Product> find(Pageable pageable, String name) {
        return iProductRepository.findAllByName (pageable, "%" + name + "%");
    }
}
