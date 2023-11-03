package case_study.furama.controller;

import case_study.furama.model.model_person.Employee;
import case_study.furama.service.IEmployeeService;
import case_study.furama.service.impl.EmployeeService;

import java.util.List;

public class EmployeeController {
   private final IEmployeeService iEmployeeService = new EmployeeService();
   public List<Employee> showList(){
       return this.iEmployeeService.showList();
   }

   public void addEmployee(Employee employee){
       this.iEmployeeService.addEmployee(employee);
   }

    public Boolean removeEmployee(String code){
      return this.iEmployeeService.removeEmployee(code);
    }

    public Employee findByCode(String code){
       return iEmployeeService.findByCode(code);
    }

    public List<Employee> searchEmployeeByName(List<Employee> employees,String name){
       return this.iEmployeeService.searchEmployeeByName(employees,name);
    }

    public void editEmployee(Employee employees,String code){
       iEmployeeService.editEmployee(employees,code);
    }

}
