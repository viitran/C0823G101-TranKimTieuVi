package ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.view;

import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.controller.ProductController;
import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.model.Product;
import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.utils.exception_handler.checkCondition;
import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.utils.reader_and_write.ReadFile;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainView {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new LinkedList<>();

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        int choice;
        do {
            System.out.println("1.Xem thông tin sản phẩm\n" +
                    "2.Thêm sản phẩm\n" +
                    "3.Tìm kiếm sản phẩm\n" +
                    "4.Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayProduct(productController);
                    break;
                case 2:
                    addProduct(productController);
                    break;
                case 3:
                    searchProduct(productController);
                    break;
                case 4:
                    System.out.println("Hẹn gặp lại!");
                    System.exit(1);
                default:
                    System.out.println("Vui lòng nhập lựa chọn hợp lệ (1 -> 4)!");
            }
        } while (true);

    }

    private static void displayProduct(ProductController productController) {
        List<Product> products = productController.findAll();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static int inputId() {
        System.out.println("Nhập id sản phẩm: ");
        return checkCondition.checkIntInput();
    }

    private static Product inputInformation() {
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá của sản phẩm: ");
        long price = checkCondition.checkLongInput();
        System.out.print("Nhập hàng sản xuất: ");
        String address = scanner.nextLine();
        System.out.print("Mô tả: ");
        String description = scanner.nextLine();
        return new Product(name, price, address, description);
    }

    private static void addProduct(ProductController productController) {
        Product product;
        int id;
        while (true) {
            id = inputId();
            Product existingProduct = productController.findById(id);
            if (existingProduct != null) {
                System.out.println("Id đã tồn tại. Vui lòng nhập lại!");
            } else {
                break;
            }
        }
        product = inputInformation();
        productController.addProduct(id, product);
        System.out.println("Thêm sản phẩm thành công! Kiểm tra lại ở mục danh sách các sản phẩm.");
    }

    private static void searchProduct(ProductController productController) {
        String name;
        List<Product> foundProduct;
        System.out.println("---Bạn đã chọn tìm kiếm sản phẩm---");
        System.out.println("Nhập tên sản phẩm bạn đang tìm: ");
        name = scanner.nextLine();
        foundProduct = productController.searchProductByName(name, productController.findAll());
        if (!foundProduct.isEmpty()) {
            System.out.println("---Đã tìm thấy sản phẩm có tên---");
            System.out.println(foundProduct);
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }
}
