package com.projeto.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.workshop.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
