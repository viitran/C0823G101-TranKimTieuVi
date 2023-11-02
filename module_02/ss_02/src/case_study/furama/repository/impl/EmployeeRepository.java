package case_study.furama.repository.impl;

import case_study.furama.model.Employee;
import case_study.furama.repository.IEmployeeRepository;
import case_study.furama.utils.file_handle.ReadFile;
import case_study.furama.utils.file_handle.WriteFile;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    private static List<Employee> employees = new LinkedList<>();

    static {
        employees.add(new Employee("NV-0001", "nguyen van a", "12/12/2002", "Nu", 0123123123
                , "921575817", "nguyenvana@gmail.com", "dai hoc", "phuc vu", 120000));
        employees.add(new Employee("NV-0002", "nguyen van b", "20/09/2009", "Nu", 12345678
                , "920920904", "nguyenvanb20@gmail.com", "dai hoc", "le tan", 123123131));
    }

    @Override
    public List<Employee> showList() {
        return ReadFile.readFile(employees);
    }

    @Override
    public void addEmployee(Employee employee) {
      employees =  ReadFile.readFile(employees);
        employees.add(employee);
        WriteFile.writeFile(employees);
    }

    @Override
    public void removeEmployeeCode(String code) {
        for (Employee employee : employees) {
            if (employee.getCode().equals(code)) {
                employees.remove(employee);
                break;
            }
        }
        WriteFile.writeFile(employees);
    }

    @Override
    public Employee findByCode(String code) {
        for (Employee e : employees) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Employee> searchEmployeeByName(List<Employee> employees, String name) {
        List<Employee> employeeList = new LinkedList<>();
        for (Employee employee : employees) {
            if (employee.getName().toLowerCase().contains(name.toLowerCase())) {
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    @Override
    public void editEmployee(Employee employee, String code) {
        for (Employee e : employees){
            if (e.getCode().equals(code)){
                e.setName(employee.getName());
                e.setBirthday(employee.getBirthday());
                e.setGender(employee.getGender());
                e.setIdCard(employee.getIdCard());
                e.setPhoneNumber(employee.getPhoneNumber());
                e.setEmail(employee.getEmail());
                e.setLevel(employee.getLevel());
                e.setPosition(employee.getPosition());
                e.setWage(employee.getWage());
                break;
            }
        }
        WriteFile.writeFile(employees);
    }
}
