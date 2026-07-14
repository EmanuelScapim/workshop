package com.projeto.workshop.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projeto.workshop.entities.User;
import com.projeto.workshop.repositories.UserRepository;


@Service
public class UserService {
	private final UserRepository repository;

	UserService(UserRepository repository) {
		this.repository = repository;
	}
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
