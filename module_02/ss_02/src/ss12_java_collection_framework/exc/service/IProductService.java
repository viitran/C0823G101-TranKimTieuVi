package ss12_java_collection_framework.exc.service;

import ss12_java_collection_framework.exc.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    void addProduct(Product product);

    Boolean removeProduct(int id);

    Product findById(int id);

    void editProduct(Product product);

    List<Product> searchProductByName(String productName, List<Product> allProducts);

    void sortAscendingProduct();

    void sortDescendingProduct();

}
