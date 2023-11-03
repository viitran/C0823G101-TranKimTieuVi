package case_study.furama.utils.file_handle;

import case_study.furama.model.model_person.Customer;
import case_study.furama.model.model_person.Employee;

import java.io.*;
import java.util.List;

public class WriteFile {
    private static final String PATH = "D:\\Codegym\\C0823G101-TranKimTieuVi\\module_02\\ss_02\\src\\" +
            "case_study\\furama\\data\\employee.csv";

    private static final String PATH_CUSTOMER = "D:\\Codegym\\C0823G101-TranKimTieuVi\\module_02\\ss_02\\src" +
            "\\case_study\\furama\\data\\customer.csv";

    public static List<Employee> writeAndProcessFileEmployee(List<Employee> employees) {
        File file = new File(PATH);
        FileWriter filterWriter;
        BufferedWriter bufferedWriter = null;
        String line;
        try {
            filterWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(filterWriter);
            for (Employee employee : employees) {
                line = employee.getCode() + "," + employee.getName() + "," + employee.getGender() + "," +
                        employee.getBirthday() + "," + employee.getIdCard() + "," + employee.getPhoneNumber()
                        + "," + employee.getMail() + "," + employee.getPosition() + "," +
                        employee.getLevel() + "," + employee.getSalary();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
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
        return employees;
    }

    public static List<Customer> writeAndProcessFileCustomer(List<Customer> customerList) {
        File file = new File(PATH_CUSTOMER);
        FileWriter filterWriter;
        BufferedWriter bufferedWriter = null;
        String line;
        try {
            filterWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(filterWriter);
            for (Customer customer : customerList) {
                line = customer.getCode() + "," + customer.getName() + "," + customer.getGender() + "," +
                        customer.getBirthday() + "," + customer.getIdCard() + "," + customer.getPhoneNumber()
                        + "," + customer.getMail() + "," + customer.getLevel()+ ","+customer.getAddress();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
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
        return customerList;
    }
}
