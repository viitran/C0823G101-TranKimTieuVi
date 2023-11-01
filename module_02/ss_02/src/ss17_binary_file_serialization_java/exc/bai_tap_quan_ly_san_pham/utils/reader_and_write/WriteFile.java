package ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.utils.reader_and_write;

import ss17_binary_file_serialization_java.exc.bai_tap_quan_ly_san_pham.model.Product;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class WriteFile {
    private static final String PATH = "D:\\Codegym\\C0823G101-TranKimTieuVi\\module_02\\ss_02" +
            "\\src\\ss17_binary_file_serialization_java\\exc\\bai_tap_quan_ly_san_pham\\data\\input";

//    public static void writeToFile(Product product) {
//        try {
//
//            FileOutputStream fileOutputStream = new FileOutputStream(PATH);
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(product);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static List<Product> writeToFileObj(List<Product> products) {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(PATH);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return products;
    }
}