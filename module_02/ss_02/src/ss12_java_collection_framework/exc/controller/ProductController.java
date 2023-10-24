package ss12_java_collection_framework.exc.controller;

import ss12_java_collection_framework.exc.service.ProductService;

public class ProductController {
    private final ProductService controller = (ProductService) new ProductService();

    public void display() {
        controller.display();
    }

    public void addList() {
        controller.addList();
    }

    public void delete() {
        controller.delete();
    }

    public void edit() {
        controller.editProduct();
    }

    public void search() {
        controller.search();
    }

    public void sortAscending() {
        controller.sortDescending();
    }

    public void sortDescending() {
        controller.sortDescending();
    }

}
