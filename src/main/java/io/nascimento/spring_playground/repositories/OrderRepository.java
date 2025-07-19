package io.nascimento.spring_playground.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.nascimento.spring_playground.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
