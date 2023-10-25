//package ss12_java_collection_framework.exc.controller;
//
//
//import ss12_java_collection_framework.exc.model.Product;
//import ss12_java_collection_framework.exc.service.IProductService;
//import ss12_java_collection_framework.exc.service.ProductService;
//
//import java.util.List;
//
//public class ProductController {
//    private final IProductService productService = new ProductService();
//
//    public List<Product> getList() {
//        return productService.getList();
//    }
//
//    public void addList(Product product) {
//        productService.addList(product);
//    }
//
//    public void delete(int id) {
//        productService.delete(id);
//    }
//
//    public void editProduct(int id, Product product) {
//        productService.editProduct(id, product);
//    }
//
//    public void search(String name) {
//        productService.search(name);
//    }
//}
