package ss12_java_collection_framework.exc.view;

import ss12_java_collection_framework.exc.controller.ProductController;
import ss12_java_collection_framework.exc.model.Product;

import java.util.List;
import java.util.Scanner;

public class MenuMain {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        ProductController productController = new ProductController();
        int choice;
        do {
            System.out.println("----Menu quản lý sản phẩm----\n" +
                    "1. Hiển thị danh sách \n" +
                    "2. Thêm sản phẩm\n" +
                    "3. Sửa sản phẩm\n" +
                    "4. Xoá sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm\n" +
                    "6. Sắp xếp sản phẩm\n" +
                    "7. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showList(productController);
                    break;
                case 2:
                    addProduct(productController);
                    break;
                case 3:
                    editProduct(productController);
                    break;
                case 4:
                    deleterProduct(productController);
                    break;
                case 5:
                    searchProduct(productController);
                    break;
                case 6:
                    listArrangePrice(productController);
                    break;
                case 7:
                    System.out.println("Cảm ơn bạn đã sử dụng dịch vụ.Hẹn gặp lại");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Số bạn nhập không hợp lệ.Vui lòng nhập lại!");
            }
        } while (true);
    }

    private static void deleterProduct(ProductController productController) {
        int id;
        int choice;
        System.out.println("---Bạn đã chọn xoá sản phẩm---");
        id = inputId();
        Boolean isSuccess = productController.removeProduct(id);
        if (isSuccess) {
            System.out.println("Bạn có muốn xoá sản phẩm này?\n" +
                    "1. Có\n" +
                    "2. Không");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Đã xoá thành công!");
                    break;
                case 2:
                    System.out.println("Xoá đã bị huỷ");
                    break;
                default:
                    System.out.println("Không hợp lệ.Xoá đã bị huỷ!");
                    break;
            }
        } else {
            System.out.println("Không tìm thấy id!");
        }
    }

    private static void searchProduct(ProductController productController) {
        String name;
        List<Product> foundProduct;
        System.out.println("---Bạn đã chọn tìm kiếm sản phẩm---");
        System.out.println("Nhập tên sản phẩm bạn đang tìm: ");
        name = scanner.nextLine();
        foundProduct = productController.searchProductByName(name, productController.getAll());
        if (!foundProduct.isEmpty()) {
            System.out.println("---Đã tìm thấy sản phẩm có tên---");
            System.out.println(foundProduct);
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }

    private static int inputId() {
        System.out.println("Nhập id sản phẩm: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static Product inputInformation() {
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá của sản phẩm: ");
        long price = Long.parseLong(scanner.nextLine());
        return new Product(name, price);
    }

    private static void showList(ProductController productController) {
        System.out.println("---Bạn đã chọn xem danh sách sản phẩm---");
        List<Product> products = productController.getAll();
        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong danh sách!");
        } else {
            System.out.println("-----Danh sách sản phẩm----");
            for (Product temp : products) {
                System.out.println(temp);
            }
        }
    }

    private static void listArrangePrice(ProductController productController) {
        System.out.println("---Bạn đã chọn sắp xếp sản phẩm theo giá tiền---");
        int choice;
        do {
            System.out.println("Bạn muốn sắp xếp theo kiểu:\n" +
                    "1. Tăng dần theo giá \n" +
                    "2. Giảm dần theo giá \n" +
                    "3. Trở lại");
            System.out.print("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("---Bạn đã chọn sắp xếp tăng dần---");
                    productController.sortAscendingProduct();
                    System.out.println("Đã sắp xếp thành công. Kiểm tra ở mục  hiển danh sách nhé!");
                    break;
                case 2:
                    System.out.println("---Bạn đã chọn sắp xếp giảm dần---");
                    productController.sortDescendingProduct();
                    System.out.println("Đã sắp xếp thành công. Kiểm tra ở mục  hiển danh sách nhé!");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Số bạn vừa nhập không hợp lệ!");
            }
        } while (true);
    }

    private static void addProduct(ProductController productController) {
        System.out.println("---Bạn đã chọn thêm sản phẩm---");
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
        product.setId(id);
        productController.addProduct(product);
        System.out.println("Thêm sản phẩm thành công! Kiểm tra lại ở mục danh sách các sản phẩm.");

    }

    private static void editProduct(ProductController productController) {
        System.out.println("---Bạn đã chọn sửa sản phẩm---");
        Product productToEdit;
        int id = inputId();
        productToEdit = productController.findById(id);
        if (productToEdit != null) {
            System.out.println("Thông tin sản phẩm cần sửa: ");
            System.out.println(productToEdit);
            productController.editProduct(id, inputInformation());
            System.out.println("Đã sửa thành công!");
        } else {
            System.out.println("Id không tồn tại. Vui lòng nhập lại!");
        }
    }

}
