package bai_tap_them_mvc.bai_tap_03.repository;

import bai_tap_them_mvc.bai_tap_03.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showList();
    void addProduct(Product product);
    Boolean findById(String id);
    void deleteProduct(String id);
}
