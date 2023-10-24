package ss12_java_collection_framework.exc.service;

import ss12_java_collection_framework.exc.repository.IProductRepository;
import ss12_java_collection_framework.exc.repository.ProductRepository;

public class ProductService implements IProductRepository {
    private final IProductRepository service = new ProductRepository();

    @Override
    public void display() {
        service.display();
    }

    @Override
    public void addList() {
        service.addList();
    }

    @Override
    public void delete() {
        service.delete();
    }

    @Override
    public void editProduct() {
        service.editProduct();
    }

    @Override
    public void search() {
        service.search();
    }

    @Override
    public void sortAscending() {
        service.sortAscending();
    }

    @Override
    public void sortDescending() {
        service.sortDescending();
    }

}
