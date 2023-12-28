package com.example.bai_tap_form_register.service;

import com.example.bai_tap_form_register.model.User;
import com.example.bai_tap_form_register.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }

    @Override
    public Optional<User> findById(Integer id) {
        return iUserRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iUserRepository.deleteById(id);
    }

}
