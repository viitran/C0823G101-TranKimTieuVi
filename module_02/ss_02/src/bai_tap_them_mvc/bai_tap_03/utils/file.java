package bai_tap_them_mvc.bai_tap_03.utils;

import bai_tap_them_mvc.bai_tap_03.model.Product;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class file {
    private static final String PATH = "test_product.txt";
    public static void readFile(){
        List<Product> products = new LinkedList<>();
        try {
            File file = new File(PATH);
            Product product;
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] strings;
            while ((line = bufferedReader.readLine())!=null){
                strings = line.split(",");
                product = new Product(strings[0],strings[1],Double.parseDouble(strings[2]));
                products.add(product);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Product> writeFile(List<Product> productList){
        try {
            File file = new File(PATH);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            for (Product pr : productList){
                line =pr.getId() + "," + pr.getName();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }
}
