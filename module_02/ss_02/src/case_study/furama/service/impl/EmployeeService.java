package case_study.furama.service.impl;

import case_study.furama.model.model_person.Employee;
import case_study.furama.repository.IEmployeeRepository;
import case_study.furama.repository.impl.EmployeeRepository;
import case_study.furama.service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private final IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> showList() {
        return iEmployeeRepository.showList();
    }

    @Override
    public void addEmployee( Employee employee) {
        iEmployeeRepository.addEmployee(employee);
    }

    @Override
    public Boolean removeEmployee(String code) {
        Employee employee = iEmployeeRepository.findByCode(code);
        if (employee == null){
            return false;
        } else {
            iEmployeeRepository.removeEmployeeCode(code);
            return true;
        }
    }

    @Override
    public Employee findByCode(String code) {
        return iEmployeeRepository.findByCode(code);
    }

    @Override
    public List<Employee> searchEmployeeByName(List<Employee> employees, String name) {
        return iEmployeeRepository.searchEmployeeByName(employees,name);
    }

    @Override
    public void editEmployee(Employee employees, String code) {
        iEmployeeRepository.editEmployee(employees,code);
    }

    @Override
    public void editNewName(String code, String newName) {
        iEmployeeRepository.editNewName(code,newName);
    }

    @Override
    public void editNewBirthday(String code, String newBirthday) {
        iEmployeeRepository.editNewBirthday(code,newBirthday);
    }

    @Override
    public void editNewGender(String code, String newGender) {
        iEmployeeRepository.editNewGender(code,newGender);
    }

    @Override
    public void editNewIdCard(String code, String newIdCard) {
        iEmployeeRepository.editNewIdCard(code,newIdCard);
    }

    @Override
    public void editNewPhoneNumber(String code, String newPhoneNumber) {
        iEmployeeRepository.editNewPhoneNumber(code,newPhoneNumber);
    }

    @Override
    public void editNewEmail(String code, String newEmail) {
    iEmployeeRepository.editNewEmail(code,newEmail);
    }

    @Override
    public void editNewPosition(String code, String newPosition) {
        iEmployeeRepository.editNewPosition(code,newPosition);
    }

    @Override
    public void editNewLevel(String code, String newLevel) {
        iEmployeeRepository.editNewLevel(code,newLevel);
    }

    @Override
    public void editNewSalary(String code, double newSalary) {
        iEmployeeRepository.editNewSalary(code,newSalary);
    }

}
