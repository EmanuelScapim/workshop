package com.projeto.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.workshop.entities.OrderItem;
import com.projeto.workshop.entities.pk.OrderItemPk;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
	
}
