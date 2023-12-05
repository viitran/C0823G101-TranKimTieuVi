package com.example.bai_tap_management_product.service.impl;

import com.example.bai_tap_management_product.model.Product;
import com.example.bai_tap_management_product.repository.IProductRepository;
import com.example.bai_tap_management_product.repository.impl.ProductRepository;
import com.example.bai_tap_management_product.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private static IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> showList() {
        return iProductRepository.showList();
    }

    @Override
    public void addNewProduct(Product product) {
        iProductRepository.addNewProduct(product);
    }

    @Override
    public Boolean deleteProduct(int id) {
        return iProductRepository.deleteProduct(id);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void editProduct(int id,Product product) {
        iProductRepository.editProduct(id,product);
    }

    @Override
    public List<Product> search( String name) {
        return iProductRepository.search(name);
    }
}
