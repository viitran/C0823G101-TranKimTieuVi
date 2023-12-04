package com.example.bai_tap_management_product.repository;

import com.example.bai_tap_management_product.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
   private static List<Product> products = new ArrayList<>();

   static {
       products.add(new Product(1,"SamSung",36000,"New","SS"));
       products.add(new Product(2,"Iphone",45000,"New","Apple"));
       products.add(new Product(3,"Laptop HP",40000,"New","HP"));
   }


    @Override
    public List<Product> showList() {
        return products;
    }
}
