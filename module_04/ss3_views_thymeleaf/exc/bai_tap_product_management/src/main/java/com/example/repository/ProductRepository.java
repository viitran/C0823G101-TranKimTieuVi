package com.example.repository;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements IProductRepository {

    private static List<Product> list = new ArrayList<>();

    static {
        list.add(new Product(1, "Samsung", 34000, "android", "korean"));
        list.add(new Product(2, "Iphone X", 45000, "Apple", "Apple"));
        list.add(new Product(3, "Laptop Dell", 50000, "14in", "Dell"));
    }

    @Override
    public List<Product> showList() {
        return list;
    }

    @Override
    public void addNewProduct(Product product) {
        list.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product p : list) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void update(int id,Product product) {
        for (Product p: list) {
            if (p.getId()==id){
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                p.setDescribe(product.getDescribe());
                p.setProducer(product.getProducer());
                break;
            }
        }
    }

    @Override
    public void remove(int id) {
        for (Product p: list) {
            if (p.getId() == id) {
                list.remove(p);
                break;
            }
        }
    }

    @Override
    public List<Product> search(String name) {
        List<Product> list1 = new ArrayList<>();
        for (Product p: list) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())){
                list1.add(p);
            }
        }
        return list1;
    }

    @Override
    public Product information(int id) {
        for (Product p: list) {
            if (p.getId()==id){
                return p;
            }
        }
        return null;
    }
}
