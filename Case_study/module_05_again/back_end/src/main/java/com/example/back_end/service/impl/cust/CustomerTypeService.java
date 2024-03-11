package com.example.back_end.service.impl.cust;

import com.example.back_end.model.Customer.CustomerType;
import com.example.back_end.repository.cust.ICustomerTypeRepository;
import com.example.back_end.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return iCustomerTypeRepository.findAll();
    }

    @Override
    public void save(CustomerType customerType) {
        iCustomerTypeRepository.save(customerType);
    }

    @Override
    public Optional<CustomerType> findById(Integer id) {
        return iCustomerTypeRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iCustomerTypeRepository.deleteById(id);
    }
}
