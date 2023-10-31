package ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.repository;

import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void addProduct(int id, Product product);

    List<Product> searchProductByName(String productName, List<Product> products);

    Product findById(int id);
}
