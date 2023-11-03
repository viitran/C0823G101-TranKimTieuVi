package case_study.furama.utils.file_handle;

import case_study.furama.model.model_person.Employee;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadFile {
    private static final String PATH = "D:\\Codegym\\C0823G101-TranKimTieuVi\\module_02\\ss_02\\src" +
            "\\case_study\\furama\\data\\employee.csv";

    public static List<Employee> readAndProcessFile() {
        List<Employee> employees = new LinkedList<>();
        Employee employee;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        String line;
        String[] tempLine;
        try {
            file = new File(PATH);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                tempLine = line.split(",");
                if (tempLine.length == 10) {
                    employee = new Employee((tempLine[0]), tempLine[1], tempLine[2], tempLine[3], tempLine[4], tempLine[5],
                            tempLine[6], tempLine[7], tempLine[8], Double.parseDouble(tempLine[9]));
                    employees.add(employee);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return employees;
    }

}
