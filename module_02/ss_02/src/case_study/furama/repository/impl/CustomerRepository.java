package case_study.furama.repository.impl;

import case_study.furama.model.model_person.Customer;
import case_study.furama.repository.ICustomerRepository;
import case_study.furama.utils.file_handle.ReadFile;
import case_study.furama.utils.file_handle.WriteFile;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = ReadFile.readAndProcessFileCustomer();

    @Override
    public List<Customer> showList() {
        return ReadFile.readAndProcessFileCustomer();
    }

    @Override
    public void add(Customer customer) {
        customerList = ReadFile.readAndProcessFileCustomer();
        customerList.add(customer);
        WriteFile.writeAndProcessFileCustomer(customerList);
    }

    @Override
    public Customer findByCode(String code) {
        for (Customer customer : customerList) {
            if (customer.getCode().equals(code)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public Boolean deleteCustomer(String code) {
        for (Customer customer : customerList) {
            if (customer.getCode().equals(code)) {
                customerList.remove(customer);
                break;
            }
        }
        WriteFile.writeAndProcessFileCustomer(customerList);
        return null;
    }

    @Override
    public void editCustomer(Customer customers, String code) {
        for (Customer customer : customerList) {
            if (customer.getCode().equals(code)) {
                customer.setName(customers.getName());
                customer.setBirthday(customers.getBirthday());
                customer.setGender(customers.getGender());
                customer.setIdCard(customers.getIdCard());
                customer.setPhoneNumber(customers.getPhoneNumber());
                customer.setMail(customers.getMail());
                customer.setLevel(customers.getLevel());
                customer.setAddress(customers.getAddress());
                break;
            }
        }
        WriteFile.writeAndProcessFileCustomer(customerList);
    }

    @Override
    public List<Customer> searchCustomer(List<Customer> customers, String name) {
        List<Customer> customerList1 = new LinkedList<>();
        for (Customer customer : customerList) {
            if (customer.getName().toLowerCase().contains(name.toLowerCase())) {
                customerList1.add(customer);
            }
        }
        return customerList1;
    }
}
