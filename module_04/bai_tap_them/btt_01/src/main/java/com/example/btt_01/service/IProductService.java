package com.example.btt_01.service;


import com.example.btt_01.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService extends IGenerationService<Product>  {
    Page<Product> find(Pageable pageable, String name);

}
