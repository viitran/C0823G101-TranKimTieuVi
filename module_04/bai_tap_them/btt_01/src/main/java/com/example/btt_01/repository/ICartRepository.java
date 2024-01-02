package com.example.btt_01.repository;

import com.example.btt_01.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartRepository extends JpaRepository<Cart,Integer> {
}
