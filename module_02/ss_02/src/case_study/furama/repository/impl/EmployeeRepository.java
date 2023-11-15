package case_study.furama.repository.impl;

import case_study.furama.model.model_person.Employee;
import case_study.furama.repository.IEmployeeRepository;
import case_study.furama.utils.file_handle.ReadFile;
import case_study.furama.utils.file_handle.WriteFile;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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
    public boolean findByCode(String code) {
        for (Employee e : employees) {
            if (e.getCode().equals(code)) {
                return true;
            }
        }
        return false;
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
        List<Employee> employeeList = showList();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getCode().equals(code)) {
                employeeList.get(i).setName(employee.getName());
                employeeList.get(i).setBirthday(employee.getBirthday());
                employeeList.get(i).setMail(employee.getMail());
                employeeList.get(i).setGender(employee.getGender());
                employeeList.get(i).setLevel(employee.getLevel());
                employeeList.get(i).setIdCard(employee.getIdCard());
                employeeList.get(i).setPosition(employee.getPosition());
                employeeList.get(i).setSalary(employee.getSalary());
                employeeList.get(i).setPhoneNumber(employee.getPhoneNumber());
            }
        }
        ReadFile.readAndProcessFileEmployee();
    }

    @Override
    public void editNewName(String code, String newName) {

        for (Employee employee : employees) {
            if (employee.getCode().equals(code)) {
                employee.setName(newName);
                WriteFile.writeAndProcessFileEmployee(employees);
                return;
            }
        }
    }

    @Override
    public void editNewBirthday(String code, String newBirthday) {
        List<Employee> employeeList = ReadFile.readAndProcessFileEmployee();
        for (Employee employee : employees) {
            if (employee.getCode().equals(code)) {
                employee.setBirthday(newBirthday);
                WriteFile.writeAndProcessFileEmployee(employeeList);
                return;
            }
        }
    }
    @Override
    public void editNewGender(String code, String newGender) {
        List<Employee> employeeList = ReadFile.readAndProcessFileEmployee();
        for (Employee employee : employees) {
            if (employee.getCode().equals(code)) {
                employee.setGender(newGender);
                WriteFile.writeAndProcessFileEmployee(employeeList);
                return;
            }
        }
    }

    @Override
    public void editNewIdCard(String code, String newIdCard) {
        List<Employee> employeeList = ReadFile.readAndProcessFileEmployee();
        for (Employee employee : employees) {
            if (employee.getCode().equals(code)) {
                employee.setIdCard(newIdCard);
                WriteFile.writeAndProcessFileEmployee(employeeList);
                return;
            }
        }
    }

    @Override
    public void editNewPhoneNumber(String code, String newPhoneNumber) {
        List<Employee> employeeList = ReadFile.readAndProcessFileEmployee();
        for (Employee employee : employees) {
            if (employee.getCode().equals(code)) {
                employee.setPhoneNumber(newPhoneNumber);
                WriteFile.writeAndProcessFileEmployee(employeeList);
                return;
            }
        }
    }

    @Override
    public void editNewEmail(String code, String newEmail) {
        List<Employee> employeeList = ReadFile.readAndProcessFileEmployee();
        for (Employee employee : employees) {
            if (employee.getCode().equals(code)) {
                employee.setMail(newEmail);
                WriteFile.writeAndProcessFileEmployee(employeeList);
                return;
            }
        }
    }

    @Override
    public void editNewPosition(String code, String newPosition) {
        List<Employee> employeeList = ReadFile.readAndProcessFileEmployee();
        for (Employee employee : employees) {
            if (employee.getCode().equals(code)) {
                employee.setPosition(newPosition);
                WriteFile.writeAndProcessFileEmployee(employeeList);
                return;
            }
        }
    }

    @Override
    public void editNewLevel(String code, String newLevel) {
        List<Employee> employeeList = ReadFile.readAndProcessFileEmployee();
        for (Employee employee : employees) {
            if (employee.getCode().equals(code)) {
                employee.setLevel(newLevel);
                WriteFile.writeAndProcessFileEmployee(employeeList);
                return;
            }
        }
    }

    @Override
    public void editNewSalary(String code, double newSalary) {
        List<Employee> employeeList = ReadFile.readAndProcessFileEmployee();
        for (Employee employee : employees) {
            if (employee.getCode().equals(code)) {
                employee.setSalary(newSalary);
                WriteFile.writeAndProcessFileEmployee(employeeList);
                return;
            }
        }
    }
}
