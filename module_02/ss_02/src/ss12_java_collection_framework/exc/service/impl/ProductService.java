package ss12_java_collection_framework.exc.service.impl;

import ss12_java_collection_framework.exc.model.Product;
import ss12_java_collection_framework.exc.repository.IProductRepository;
import ss12_java_collection_framework.exc.repository.impl.ProductRepository;
import ss12_java_collection_framework.exc.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public Boolean removeProduct(int id) {
        Product product = productRepository.findById(id);
        if (product == null) {
            return false;
        } else {
            productRepository.deleteById(id);
            return true;
        }
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void editProduct(Product product) {
        productRepository.editProduct(product);
    }

    @Override
    public List<Product> searchProductByName(String productName, List<Product> allProducts) {
        return productRepository.searchProductByName(productName, allProducts);
    }

    @Override
    public void sortAscendingProduct() {
        productRepository.sortAscendingProduct();
    }

    @Override
    public void sortDescendingProduct() {
        productRepository.sortDescendingProduct();
    }
}
