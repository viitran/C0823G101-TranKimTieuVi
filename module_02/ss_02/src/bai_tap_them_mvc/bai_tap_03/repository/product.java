package bai_tap_them_mvc.bai_tap_03.repository;

import bai_tap_them_mvc.bai_tap_03.model.Product;
import bai_tap_them_mvc.bai_tap_03.utils.ProcessFile;

import java.util.List;

public class product implements  IProductRepository{
    List<Product> products = ProcessFile.readFile();
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
        for (Product product : products){
            if (product.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteProduct(String id) {
        for (Product pr : products){
            if (pr.getId().equals(id)){
                products.remove(pr);
                break;
            }
        }
        ProcessFile.writeFile(products);
    }
}
