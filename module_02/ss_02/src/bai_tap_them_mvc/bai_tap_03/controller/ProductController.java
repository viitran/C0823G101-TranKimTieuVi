package bai_tap_them_mvc.bai_tap_03.controller;

import bai_tap_them_mvc.bai_tap_03.model.Product;
import bai_tap_them_mvc.bai_tap_03.service.IProductService;
import bai_tap_them_mvc.bai_tap_03.service.impl.ProductService;

import java.util.List;

public class ProductController {
    private IProductService iProductService = new ProductService();
    public List<Product> showList(){
        return iProductService.showList();
    }
    public void addProduct(Product product){
        iProductService.addProduct(product);
    }
    public Boolean findById(String id){
        return iProductService.findById(id);
    }
    public Boolean delete(String id){
        return iProductService.deleteProduct(id);
    }
}
