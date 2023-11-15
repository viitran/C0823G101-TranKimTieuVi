package bai_tap_them_mvc.bai_tap_03.utils;

import bai_tap_them_mvc.bai_tap_03.model.Product;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ProcessFile {
    private static final String PATH = "D:\\Codegym\\C0823G101-TranKimTieuVi\\module_02" +
            "\\ss_02\\src\\bai_tap_them_mvc\\bai_tap_03\\data\\test_product.txt";

    private static final String COMMON = ",";

    public static List<Product> readFile() {
        List<Product> products = new LinkedList<>();
        Product product;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        String line;
        String[] strings;
        try {
            file = new File(PATH);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");
                product = new Product(strings[0], strings[1], Double.parseDouble(strings[2]));
                products.add(product);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File it note exists!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return products;
    }

    public static List<Product> writeFile(List<Product> product1) {
        File file;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        String line;
        try {
            file = new File(PATH);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Product product : product1) {
                line = product.getId() + COMMON + product.getName() + COMMON + product.getPrice();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return product1;
    }

}
