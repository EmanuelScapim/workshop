package com.projeto.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.workshop.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
