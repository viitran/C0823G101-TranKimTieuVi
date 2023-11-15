package case_study.furama.service;

import case_study.furama.model.model_person.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> showList();
    void addEmployee(Employee employee);
    Boolean removeEmployee(String code);
    Boolean findByCode(String code);
    List<Employee> searchEmployeeByName(List<Employee> employees, String name);
    void editEmployee(Employee employees, String code);
    void editNewName(String code,String newName);
    void editNewBirthday(String code,String newBirthday);
    void editNewGender(String code,String newGender);
    void editNewIdCard(String code,String newIdCard);
    void editNewPhoneNumber(String code,String newPhoneNumber);
    void editNewEmail(String code,String newEmail);
    void editNewPosition(String code,String newPosition);
    void editNewLevel(String code,String newLevel);
    void editNewSalary(String code,double newSalary);
}
