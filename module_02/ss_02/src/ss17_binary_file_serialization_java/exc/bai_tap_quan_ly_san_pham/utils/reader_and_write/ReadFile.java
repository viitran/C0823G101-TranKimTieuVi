package ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.utils.reader_and_write;

import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.model.Product;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadFile {
    private static final String PATH = "D:\\Codegym\\C0823G101-TranKimTieuVi\\module_02\\ss_02\\src\\" +
            "ss17_binary_file_serialization_java\\exc\\bai_tap_quan_ly_san_pham\\data\\input";

    public static List<Product> readFileList(List<Product> products) {
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(PATH);
            objectInputStream = new ObjectInputStream(fileInputStream);
            products = (LinkedList<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("a");
        } catch (IOException e) {
            System.out.println("File khong co gi!");
//            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("null");
//            throw new RuntimeException(e);
        } finally {
            try {
                objectInputStream.close();
            } catch (Exception e) {
                System.out.println("null");
//                throw new RuntimeException(e);
            }
        }
        return products == null? new LinkedList<>() : products;
    }

//    public static void readFile() {
//        List<Product> products = new LinkedList<>();
//        FileInputStream fileInputStream;
//        Product p;
//        try {
//            fileInputStream = new FileInputStream(PATH);
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            p = (Product) objectInputStream.readObject();
//            System.out.println(p);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
