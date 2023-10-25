//package ss12_java_collection_framework.exc.repository;
//
//import ss12_java_collection_framework.exc.model.Product;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//import java.util.Scanner;
//
//public class ProductRepository implements IProductRepository {
//    Scanner scanner = new Scanner(System.in);
//
//    public static ArrayList<Product> products = new ArrayList<>();
//
//    static {
//        products.add(new Product(1, "Iphone", 700));
//        products.add(new Product(2, "SamSung", 600));
//        products.add(new Product(3, "Nokia", 400));
//    }
//
//
//    @Override
//    public List<Product> getList() {
//        return products;
//    }
//
//    @Override
//    public void addList(Product product) {
//        products.add(product);
//    }
//
//    @Override
//    public void delete(int id) {
//        for (Product product : products) {
//            if (product.getId() == id) {
//                products.remove(product);
//                break;
//            }
//        }
//    }
//
//    @Override
//    public void editProduct(int id, Product product) {
//        for (Product product1 : products) {
//            if (product.getId() == id) {
//                product1.setName(product.getName());
//                product1.setPrice(product.getPrice());
//            }
//        }
//    }
//
//    @Override
//    public void search(String name) {
//        for (Product product : products) {
//            if (product.getName().contains(name)) {
//                System.out.println(name);
//            }
//        }
//    }
//}
