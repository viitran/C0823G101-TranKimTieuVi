package ss12_java_collection_framework.exc.repository.impl;

import ss12_java_collection_framework.exc.model.Product;
import ss12_java_collection_framework.exc.repository.IProductRepository;
import ss12_java_collection_framework.exc.utils.comparator.PriceArrangeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "IPhone", 7500));
        products.add(new Product(2, "SamSung", 6200));
        products.add(new Product(3, "Nokia", 800));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
    }


    @Override
    public void editProduct(int id,Product product) {
        for (Product existingProduct : products) {
            if (existingProduct.getId() == id) {
                existingProduct.setName(product.getName());
                existingProduct.setPrice(product.getPrice());
                break;
            }
        }
    }

    @Override
    public List<Product> searchProductByName(String productName, List<Product> allProducts) {
        List<Product> foundProducts = new ArrayList<>();
        for (Product product : allProducts) {
            if (product.getName().toLowerCase().contains(productName.toLowerCase())) {
                foundProducts.add(product);
            }
        }
        return foundProducts;
    }

    @Override
    public void sortDescendingProduct() {
        Collections.sort(products, new PriceArrangeComparator());
    }

    @Override
    public void sortAscendingProduct() {
        Collections.sort(products, new PriceArrangeComparator());
    }


}
