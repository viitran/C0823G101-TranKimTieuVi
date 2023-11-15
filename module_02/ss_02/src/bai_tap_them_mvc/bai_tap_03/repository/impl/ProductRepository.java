package bai_tap_them_mvc.bai_tap_03.repository.impl;

import bai_tap_them_mvc.bai_tap_03.model.Product;
import bai_tap_them_mvc.bai_tap_03.repository.IProductRepository;
import bai_tap_them_mvc.bai_tap_03.utils.ProcessFile;

import java.util.LinkedList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = ProcessFile.readFile();

    @Override
    public List<Product> showList() {
        return ProcessFile.readFile();
    }

    @Override
    public void addProduct(Product product) {
        products = ProcessFile.readFile();
        products.add(product);
        ProcessFile.writeFile(products);
    }

    @Override
    public Boolean findById(String id) {
        products = ProcessFile.readFile();
        for (Product pr: products) {
            if (pr.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteProduct(String id) {
        for (Product product : products){
            if (product.getId().equals(id)){
                products.remove(product);
                break;
            }
        }
        ProcessFile.writeFile(products);
    }
}
