package bai_tap_them_mvc.bai_tap_03.service.impl;

import bai_tap_them_mvc.bai_tap_03.model.Product;
import bai_tap_them_mvc.bai_tap_03.repository.IProductRepository;
import bai_tap_them_mvc.bai_tap_03.repository.impl.ProductRepository;
import bai_tap_them_mvc.bai_tap_03.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> showList() {
        return iProductRepository.showList();
    }

    @Override
    public void addProduct(Product product) {
        iProductRepository.addProduct(product);
    }
    @Override
    public Boolean findById(String id) {
        return iProductRepository.findById(id);
    }

    @Override
    public Boolean deleteProduct(String id) {
        Boolean isSuccess = iProductRepository.findById(id);
        if (isSuccess) {
            iProductRepository.deleteProduct(id);
            return true;
        } else {
            return false;
        }
    }
}
