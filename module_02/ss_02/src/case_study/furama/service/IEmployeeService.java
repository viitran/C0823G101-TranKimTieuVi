package case_study.furama.service;

import case_study.furama.model.model_person.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> showList();

    void addEmployee(Employee employee);

    Boolean removeEmployee(String code);

    Employee findByCode(String code);

    List<Employee> searchEmployeeByName(List<Employee> employees, String name);

    void editEmployee(Employee employees,String code);
}
