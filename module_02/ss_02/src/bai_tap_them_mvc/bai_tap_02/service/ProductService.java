package bai_tap_them_mvc.bai_tap_02.service;


import bai_tap_them_mvc.bai_tap_02.repository.IProductRepository;
import bai_tap_them_mvc.bai_tap_02.repository.ProductRepository;

public class ProductService implements IProductService {
    private final IProductRepository productRepository = new ProductRepository();

    @Override
    public void display() {
        productRepository.display();
    }

    @Override
    public void addList() {
        productRepository.addList();
    }

    @Override
    public void delete() {
        productRepository.delete();
    }

    @Override
    public void editProduct() {
        productRepository.editProduct();
    }

    @Override
    public void search() {
        productRepository.search();
    }

    @Override
    public void sortAscending() {
        productRepository.sortAscending();
    }

    @Override
    public void sortDescending() {
        productRepository.sortDescending();
    }
}
