package ss12_java_collection_framework.exc.controller;


import ss12_java_collection_framework.exc.model.Product;
import ss12_java_collection_framework.exc.service.IProductService;
import ss12_java_collection_framework.exc.service.impl.ProductService;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductService();

    public List<Product> getAll() {
        return productService.getAll();
    }

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    public Boolean removeProduct(int id) {
        return productService.removeProduct(id);
    }

    public Product findById(int id) {
        return productService.findById(id);
    }

    public void editProduct(int id, Product product) {
        productService.editProduct(id,product);
    }

    public List<Product> searchProductByName(String productName, List<Product> allProducts) {
        return productService.searchProductByName(productName, allProducts);
    }

    public void sortAscendingProduct() {
        productService.sortAscendingProduct();
    }

    public void sortDescendingProduct() {
        productService.sortDescendingProduct();
    }



}
