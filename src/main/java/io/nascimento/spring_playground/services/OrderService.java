package io.nascimento.spring_playground.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.nascimento.spring_playground.entities.Order;
import io.nascimento.spring_playground.repositories.OrderRepository;


@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> data = orderRepository.findById(id);
		return data.get();
	}
	
}
