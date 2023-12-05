package com.example.bai_tap_management_product.repository;

import com.example.bai_tap_management_product.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showList();
    void addNewProduct(Product product);
    Boolean deleteProduct(int id);
    Product findById(int id);
    void editProduct(int id,Product product);
    List<Product> search(String name);
}
