package io.nascimento.spring_playground.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.nascimento.spring_playground.entities.User;
import io.nascimento.spring_playground.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long Id) {
		Optional<User> data = userRepository.findById(Id);
		return data.get();
	}
	
}
