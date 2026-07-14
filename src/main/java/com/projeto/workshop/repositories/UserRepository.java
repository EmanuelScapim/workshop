package com.projeto.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.workshop.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
}
