package com.projeto.workshop.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projeto.workshop.entities.Order;
import com.projeto.workshop.repositories.OrderRepository;


@Service
public class OrderService {
	private final OrderRepository repository;

	OrderService(OrderRepository repository) {
		this.repository = repository;
	}
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}

