package ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.controller;

import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.model.Product;
import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.service.IProductService;
import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.service.impl.ProductService;

import java.security.PublicKey;
import java.util.List;

public class ProductController {
    private final IProductService iProductService = new ProductService();

    public List<Product> findAll() {
        return this.iProductService.findAll();
    }

    public void addProduct(int id, Product product) {
        this.iProductService.addProduct(id, product);
    }

    public Product findById(int id) {
        return iProductService.findById(id);
    }

    public List<Product> searchProductByName(String productName, List<Product> products) {
        return iProductService.searchProductByName(productName, products);
    }
}
