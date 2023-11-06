package case_study.furama.repository;

import case_study.furama.model.model_person.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> showList();

    void add(Customer customer);

    Customer findByCode(String code);

    Boolean deleteCustomer(String code);

    void editCustomer(Customer customers, String code);

    List<Customer> searchCustomer(List<Customer> customers, String name);
}
