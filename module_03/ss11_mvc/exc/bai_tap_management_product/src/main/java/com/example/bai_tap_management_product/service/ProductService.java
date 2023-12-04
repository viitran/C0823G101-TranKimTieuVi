package com.example.bai_tap_management_product.service;

import com.example.bai_tap_management_product.model.Product;
import com.example.bai_tap_management_product.repository.IProductRepository;
import com.example.bai_tap_management_product.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    private IProductRepository iProductReposioty = new ProductRepository();

    @Override
    public List<Product> showList() {
        return iProductReposioty.showList();
    }
}
