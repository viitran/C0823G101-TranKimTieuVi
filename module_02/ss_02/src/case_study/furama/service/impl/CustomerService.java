package case_study.furama.service.impl;

import case_study.furama.model.model_person.Customer;
import case_study.furama.repository.ICustomerRepository;
import case_study.furama.repository.impl.CustomerRepository;
import case_study.furama.service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private final ICustomerRepository iCustomerRepository = new CustomerRepository();

    @Override
    public List<Customer> showList() {
        return iCustomerRepository.showList();
    }

    @Override
    public void add(Customer customer) {
        iCustomerRepository.add(customer);
    }

    @Override
    public Customer findByCode(String code) {
        return iCustomerRepository.findByCode(code);
    }

    @Override
    public Boolean deleteCustomer(String code) {
        return iCustomerRepository.deleteCustomer(code);
    }

    @Override
    public void editCustomer(Customer customers, String code) {
        iCustomerRepository.editCustomer(customers, code);
    }

    @Override
    public List<Customer> searchCustomer(List<Customer> customers, String name) {
        return iCustomerRepository.searchCustomer(customers, name);
    }
}
