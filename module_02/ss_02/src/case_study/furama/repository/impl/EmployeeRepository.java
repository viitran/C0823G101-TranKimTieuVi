package case_study.furama.repository.impl;

import case_study.furama.model.model_person.Employee;
import case_study.furama.repository.IEmployeeRepository;
import case_study.furama.utils.file_handle.ReadFile;
import case_study.furama.utils.file_handle.WriteFile;


import java.util.LinkedList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    private static List<Employee> employees = ReadFile.readAndProcessFileEmployee();

    @Override
    public List<Employee> showList() {
        List<Employee> employees = ReadFile.readAndProcessFileEmployee();
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees = ReadFile.readAndProcessFileEmployee();
        employees.add(employee);
        WriteFile.writeAndProcessFileEmployee(employees);
    }

    @Override
    public void removeEmployeeCode(String code) {
        for (Employee employee : employees) {
            if (employee.getCode().equals(code)) {
                employees.remove(employee);
                break;
            }
        }
        WriteFile.writeAndProcessFileEmployee(employees);
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
        for (Employee e : employees) {
            if (e.getCode().equals(code)) {
                e.setName(employee.getName());
                e.setBirthday(employee.getBirthday());
                e.setGender(employee.getGender());
                e.setIdCard(employee.getIdCard());
                e.setPhoneNumber(employee.getPhoneNumber());
                e.setMail(employee.getMail());
                e.setLevel(employee.getLevel());
                e.setPosition(employee.getPosition());
                e.setSalary(employee.getSalary());
                break;
            }
        }
        WriteFile.writeAndProcessFileEmployee(employees);
    }
}
