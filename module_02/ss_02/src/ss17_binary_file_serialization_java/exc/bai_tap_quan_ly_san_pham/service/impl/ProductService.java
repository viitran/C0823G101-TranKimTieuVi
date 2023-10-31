package ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.service.impl;

import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.model.Product;
import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.repository.IProductRepository;
import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.repository.impl.ProductRepository;
import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private final IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return this.iProductRepository.findAll();
    }

    @Override
    public void addProduct(int id, Product product) {
        iProductRepository.addProduct(id, product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public List<Product> searchProductByName(String productName, List<Product> products) {
        return iProductRepository.searchProductByName(productName, products);
    }
}
