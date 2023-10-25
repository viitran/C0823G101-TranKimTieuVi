package bai_tap_them_mvc.bai_tap_02.view;

import bai_tap_them_mvc.bai_tap_02.controller.ProductController;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        int choice;
        int sortChoice;
        Scanner scanner = new Scanner(System.in);
        ProductController controller = new ProductController();
        do {
            System.out.println("Chọn chức năng sau: \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Sửa thông tin sản phẩm \n" +
                    "3. Xoá sản phẩm \n" +
                    "4. Hiển thị danh sách sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm \n" +
                    "6. Sắp xếp sản phẩm \n" +
                    "7. Thoát");
            System.out.print("Chọn chức năng số: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    controller.addList();
                    break;
                case 2:
                    controller.edit();
                    break;
                case 3:
                    controller.delete();
                    break;
                case 4:
                    System.out.println("---Danh sách sản phẩm---");
                    controller.display();
                    break;
                case 5:
                    controller.search();
                    break;
                case 6:
                    System.out.println("Chọn cách sắp xếp theo giá tiền: \n" +
                            "1. Sắp xếp giảm dần \n" +
                            "2. Sắp xếp tăng dần");
                    System.out.print("Chọn cách sắp xếp (1 hoặc 2): ");
                    sortChoice = Integer.parseInt(scanner.nextLine());
                    if (sortChoice == 1) {
                        controller.sortDescending();
                        System.out.println("---Sắp xếp giảm dần---");
                        controller.display();
                    } else if (sortChoice == 2) {
                        System.out.println("---Sắp xếp tăng dần---");
                        controller.sortAscending();
                        controller.display();
                    } else {
                        System.out.println("Lựa chọn không hợp lệ.");
                    }
                    break;
                case 7:
                    System.out.println("Cảm ơn bạn đã sử dụng dịch vụ của chúng tui!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Số bạn vừa nhập trên không có chức năng.Vui lòng nhập lại");
            }
        } while (true);
    }
}
