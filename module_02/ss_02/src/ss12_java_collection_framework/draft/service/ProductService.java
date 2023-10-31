//package ss12_java_collection_framework.exc.service;
//
//import ss12_java_collection_framework.exc.model.Product;
//import ss12_java_collection_framework.exc.repository.IProductRepository;
//import ss12_java_collection_framework.exc.repository.ProductRepository;
//
//import java.util.List;
//
//public class ProductService implements IProductService {
//    private final IProductRepository productRepository = new ProductRepository();
//
//
//    @Override
//    public List<Product> getList() {
//        return productRepository.getList();
//    }
//
//    @Override
//    public void addList(Product product) {
//        productRepository.addList(product);
//    }
//
//    @Override
//    public void delete(int id) {
//        productRepository.delete(id);
//    }
//
//    @Override
//    public void editProduct(int id, Product product) {
//        productRepository.editProduct(id, product);
//    }
//
//    @Override
//    public void search(Country name) {
//        productRepository.search(name);
//    }
//}
