package bai_tap_them_mvc.bai_tap_02.controller;

import bai_tap_them_mvc.bai_tap_02.service.IProductService;
import bai_tap_them_mvc.bai_tap_02.service.ProductService;


public class ProductController {
    private final IProductService productController =  new ProductService();

    public void display() {
        productController.display();
    }

    public void addList() {
        productController.addList();
    }

    public void delete() {
        productController.delete();
    }

    public void edit() {
        productController.editProduct();
    }

    public void search() {
        productController.search();
    }

    public void sortAscending() {
        productController.sortDescending();
    }

    public void sortDescending() {
        productController.sortDescending();
    }
}
