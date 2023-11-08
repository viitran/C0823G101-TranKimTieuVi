package case_study.furama.controller;

import case_study.furama.model.model_person.Employee;
import case_study.furama.service.IEmployeeService;
import case_study.furama.service.impl.EmployeeService;

import java.util.List;

public class EmployeeController {
    private final IEmployeeService iEmployeeService = new EmployeeService();

    public List<Employee> showList() {
        return this.iEmployeeService.showList();
    }

    public void addEmployee(Employee employee) {
        this.iEmployeeService.addEmployee(employee);
    }

    public Boolean removeEmployee(String code) {
        return this.iEmployeeService.removeEmployee(code);
    }

    public Employee findByCode(String code) {
        return iEmployeeService.findByCode(code);
    }

    public List<Employee> searchEmployeeByName(List<Employee> employees, String name) {
        return this.iEmployeeService.searchEmployeeByName(employees, name);
    }
    public void editEmployee(Employee employees, String code) {
        iEmployeeService.editEmployee(employees, code);
    }
    public void editNewName(String code, String newName) {
        iEmployeeService.editNewName(code, newName);
    }
    public void editNewBirthday(String code, String newBirthday) {
        iEmployeeService.editNewBirthday(code, newBirthday);
    }
    public void editNewGender(String code, String newGender) {
        iEmployeeService.editNewGender(code, newGender);
    }
    public void editNewIdCard(String code, String newIdCard) {
        iEmployeeService.editNewGender(code, newIdCard);
    }
    public void editNewPhoneNumber(String code, String newPhoneNumber) {
        iEmployeeService.editNewPhoneNumber(code, newPhoneNumber);
    }
    public void editNewEmail(String code, String newEmail) {
        iEmployeeService.editNewEmail(code, newEmail);
    }
    public void editNewPosition(String code, String newPosition) {
        iEmployeeService.editNewPosition(code, newPosition);
    }
    public void editNewLevel(String code, String newLevel) {
        iEmployeeService.editNewLevel(code, newLevel);
    }
    public void editNewSalary(String code, double newSalary) {
        iEmployeeService.editNewSalary(code, newSalary);
    }

}
