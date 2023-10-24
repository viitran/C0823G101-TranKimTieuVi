package ss12_java_collection_framework.exc.repository;

import ss12_java_collection_framework.exc.model.Product;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    Scanner scanner = new Scanner(System.in);

    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Iphone", 700));
        products.add(new Product(2, "SamSung", 600));
        products.add(new Product(3, "Nokia", 400));
    }

    @Override
    public void display() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public void addList() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (checkId(id)) {
            System.out.println("Id: " + id + " đã tồn tại trong danh sách.Vui lòng nhập lại");
        } else {
            System.out.println("Nhập tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.println("Nhập giá tiền: ");
            int price = Integer.parseInt(scanner.nextLine());
            Product product = new Product(id, name, price);
            products.add(product);
            System.out.println("Đã thêm sản phẩm thành công. Hãy chọn chức năng hiển thị danh sách để xem nhé!");
        }
    }

    public void delete() {
        System.out.println("Nhập id cần xoá: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
            } else {
                System.out.println("id bạn nhập không hợp lệ!");
                break;
            }
        }
    }

    public void editProduct() {
        System.out.println("Nhập ID bạn muốn chỉnh sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        double newPrice;
        String newName;

        for (Product product : products) {
            if (id == product.getId()) {
                System.out.print("Nhập lại tên sản phẩm: ");
                newName = scanner.nextLine();
                product.setName(newName);
                System.out.print("Nhập lại giá tiền: ");
                newPrice = Double.parseDouble(scanner.nextLine());
                product.setPrice(newPrice);
                System.out.println("Đã sửa thành công.Chọn hiển thị danh sách để xem lại nhé!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có ID bạn vừa nhập để chỉnh sửa.");
        }
    }


    @Override
    public void search() {
        System.out.println("Nhập tên sản phẩm bạn đang tìm: ");
        String name = scanner.nextLine();
        for (Product product : products) {
            if (Objects.equals(product.getName(), name)) {
                System.out.println(product);
                return;
            }
        }
        System.out.println("Tên sản phẩm không tồn tại");
    }

    @Override
    public void sortAscending() {
        for (int i = 0; i < products.size() - 1; i++) {
            for (int j = 0; j < products.size() - i - 1; j++) {
                if (products.get(j).getPrice() > products.get(j + 1).getPrice()) {
                    Product temp = products.get(j);
                    products.set(j, products.get(j + 1));
                    products.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public void sortDescending() {
        for (int i = 0; i < products.size() - 1; i++) {
            for (int j = 0; j < products.size() - i - 1; j++) {
                if (products.get(j).getPrice() < products.get(j + 1).getPrice()) {
                    Product temp = products.get(j);
                    products.set(j, products.get(j + 1));
                    products.set(j + 1, temp);
                }
            }
        }
    }

    public boolean checkId(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
