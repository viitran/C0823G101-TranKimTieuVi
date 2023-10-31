package ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.repository.impl;

import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.model.Product;
import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.repository.IProductRepository;
import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.utils.reader_and_write.ReadFile;
import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.utils.reader_and_write.WriteFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new LinkedList<>();

    //    @Override
//    public List<Product> findAll() {
//        return products;
//    }
    @Override
    public List<Product> findAll() {
        return getListProduct();
    }

    //    @Override
//    public void addProduct(List<Product> product) {
//        WriteFile.writeToFile(product);
//    }
    @Override
    public void addProduct(int id, Product product) {
        List<Product> productList = getListProduct();
        productList.add(new Product(id, product.getName(), product.getPrice(), product.getDescription(), product.getAddress()));
        WriteFile.writeToFileObj(productList);
    }

    private List<Product> getListProduct() {
        return ReadFile.readFileList(products);
    }

    @Override
    public List<Product> searchProductByName(String productName, List<Product> products) {
        List<Product> foundProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(productName.toLowerCase())) {
                foundProducts.add(product);
            }
        }
        return foundProducts;
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
}
