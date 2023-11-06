package case_study.furama.controller;

import case_study.furama.model.model_person.Customer;
import case_study.furama.service.ICustomerService;
import case_study.furama.service.impl.CustomerService;

import java.util.List;

public class CustomerController {

    private final ICustomerService iCustomerService = new CustomerService();

    public List<Customer> showListCustomer() {
        return iCustomerService.showList();
    }

    public void addCustomer(Customer customer) {
        iCustomerService.add(customer);
    }

    public Customer findByCode(String code) {
        return iCustomerService.findByCode(code);
    }

    public Boolean deleteCustomer(String code) {
        return iCustomerService.deleteCustomer(code);
    }

    public void editCustomer(Customer customers, String code) {
        iCustomerService.editCustomer(customers, code);
    }

    public List<Customer> searchCustomer(List<Customer> customers, String name) {
        return iCustomerService.searchCustomer(customers, name);
    }
}
