package bai_tap_them_mvc.bai_tap_03.view;

import bai_tap_them_mvc.bai_tap_03.controller.ProductController;
import bai_tap_them_mvc.bai_tap_03.model.Product;

import java.util.List;
import java.util.Scanner;

public class mainView {
    private static Scanner scanner = new Scanner(System.in);
    private static final ProductController productController = new ProductController();
    private static int id;

    public static void renderMenuProduct() {
        do {
            List<Product> products = productController.showList();
            System.out.println("Menu Product has \n" +
                    "1.Display All Product\n" +
                    "2.Add new Product\n" +
                    "3.Delete product");
            System.out.print("Your choice is:  ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    if (products.isEmpty()) {
                        System.out.println("File is empty");
                    } else {
                        for (Product product : products) {
                            System.out.println(product);
                        }
                    }
                    break;
                case 2:
                    Product product;
                    String id = inputId();
                    Boolean isSuccess = productController.findById(id);
                    if (!isSuccess) {
                        product = inputInformation();
                        product.setId(id);
                        productController.addProduct(product);
                        System.out.println("Done");
                    } else {
                        System.out.println("this id it exists");
                    }
                    break;
                case 3:
                    System.out.println("Enter id to remove: ");
                    id = inputId();
                    boolean isBoolean = productController.delete(id);
                    if (isBoolean) {
                        System.out.println("Delete complete");
                    } else {
                        System.out.println("Cant find id");
                    }
                    break;
                default:
                    System.out.println("Re-enter again! Please choice 1 -> 3");
            }
        } while (true);
    }

    private static String inputId() {
        System.out.print("Enter id product: ");
        return scanner.nextLine();
    }

    private static Product inputInformation() {
        System.out.print("Enter name product: ");
        String name = scanner.nextLine();
        System.out.print("Enter price of product: ");
        double price = Double.parseDouble(scanner.nextLine());
        return new Product(name, price);
    }

    public static void main(String[] args) {
        renderMenuProduct();
    }
}
