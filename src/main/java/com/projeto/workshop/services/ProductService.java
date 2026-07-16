package com.projeto.workshop.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projeto.workshop.entities.Product;
import com.projeto.workshop.repositories.ProductRepository;


@Service
public class ProductService {
	private final ProductRepository repository;

	ProductService(ProductRepository repository) {
		this.repository = repository;
	}
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}

