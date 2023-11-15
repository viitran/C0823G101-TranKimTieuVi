package bai_tap_them_mvc.bai_tap_03.service;

import bai_tap_them_mvc.bai_tap_03.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> showList();
    void addProduct(Product product);
    Boolean findById(String id);
    Boolean deleteProduct(String id);
}
