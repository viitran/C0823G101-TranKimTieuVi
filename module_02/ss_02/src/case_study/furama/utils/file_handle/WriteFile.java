package case_study.furama.utils.file_handle;

import case_study.furama.model.Employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteFile {
    private static final String PATH = "D:\\Codegym\\C0823G101-TranKimTieuVi\\module_02\\ss_02\\src\\" +
            "case_study\\furama\\data\\employee.csv";
    public static List<Employee> writeFile(List<Employee> employees) {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(PATH);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employees);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Added file successfully ");
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return employees;
    }
}
