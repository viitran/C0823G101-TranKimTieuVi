package ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.service;


import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void addProduct(int id, Product product);

    Product findById(int id);

    List<Product> searchProductByName(String productName, List<Product> products);
}
