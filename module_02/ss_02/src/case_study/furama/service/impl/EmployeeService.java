package case_study.furama.service.impl;

import case_study.furama.model.Employee;
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

}
