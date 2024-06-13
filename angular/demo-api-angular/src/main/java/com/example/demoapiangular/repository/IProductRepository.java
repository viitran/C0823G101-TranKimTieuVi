package com.example.demoapiangular.repository;

import com.example.demoapiangular.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Integer> {
}
