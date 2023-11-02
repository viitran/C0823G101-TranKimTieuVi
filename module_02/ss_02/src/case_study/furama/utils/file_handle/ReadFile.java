package case_study.furama.utils.file_handle;

import case_study.furama.model.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

public class ReadFile {
    private static final String PATH = "D:\\Codegym\\C0823G101-TranKimTieuVi\\module_02\\ss_02\\src" +
            "\\case_study\\furama\\data\\employee.csv";

    public static List<Employee> readFile(List<Employee> employees) {
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(PATH);
            objectInputStream = new ObjectInputStream(fileInputStream);
            employees = (LinkedList<Employee>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("a");
        } catch (IOException e) {
            System.out.println("Open file successfully!! ");
        } catch (ClassNotFoundException e) {
            System.out.println("c");
        } finally {
            try {
                objectInputStream.close();
            } catch (Exception e) {
                System.out.println("null");
            }
        }
        return employees == null ? new LinkedList<>() : employees;
    }
}
