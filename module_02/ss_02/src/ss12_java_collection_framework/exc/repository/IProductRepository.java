package ss12_java_collection_framework.exc.repository;

import ss12_java_collection_framework.exc.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void addProduct(Product product);

    Product findById(int id);

    void deleteById(int id);

    void editProduct(int id,Product product);

    List<Product> searchProductByName(String productName, List<Product> allProducts);

    void sortDescendingProduct();

    void sortAscendingProduct();
}
