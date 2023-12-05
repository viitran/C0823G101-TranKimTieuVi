package com.example.bai_tap_management_product.repository.impl;

import com.example.bai_tap_management_product.model.Product;
import com.example.bai_tap_management_product.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "SamSung", 36000, "New", "SS"));
        products.add(new Product(2, "Iphone", 45000, "New", "Apple"));
        products.add(new Product(3, "Laptop HP", 40000, "New", "HP"));
    }


    @Override
    public List<Product> showList() {
        return products;
    }

    @Override
    public void addNewProduct(Product product) {
        products.add(product);
    }

    @Override
    public Boolean deleteProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
        return null;
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void editProduct(Product product, int id) {
        for (Product p: products) {
            if (p.getId() == id){
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                p.setDescription(product.getDescription());
                p.setProducer(product.getProducer());
            }
        }
    }

    @Override
    public List<Product> search( String name) {
        List<Product> products1 = new ArrayList<>();
        for (Product p: products){
            if (p.getName().toLowerCase().contains(name.toLowerCase())){
                products1.add(p);
            }
        }
        return products1;
    }
}
