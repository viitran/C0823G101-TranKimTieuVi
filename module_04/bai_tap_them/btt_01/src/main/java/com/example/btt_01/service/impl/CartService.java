package com.example.btt_01.service.impl;

import com.example.btt_01.model.Cart;
import com.example.btt_01.repository.ICartRepository;
import com.example.btt_01.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CartService implements ICartService {
    @Autowired
    private ICartRepository iCartRepository;
    @Override
    public Iterable<Cart> findAll() {
        return iCartRepository.findAll();
    }

    @Override
    public void save(Cart cart) {
        iCartRepository.save(cart);
    }

    @Override
    public Optional<Cart> findById(Integer id) {
        return iCartRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        iCartRepository.deleteById(id);
    }
}
