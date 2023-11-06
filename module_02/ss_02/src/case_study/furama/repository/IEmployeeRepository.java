package case_study.furama.repository;

import case_study.furama.model.model_person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> showList();

    void addEmployee(Employee employee);

    void removeEmployeeCode(String code);

    Employee findByCode(String code);

    List<Employee> searchEmployeeByName(List<Employee> employees, String name);

    void editEmployee(Employee employees, String code);
}
