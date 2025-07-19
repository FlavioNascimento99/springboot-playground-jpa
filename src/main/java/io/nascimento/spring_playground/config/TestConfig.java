package io.nascimento.spring_playground.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.nascimento.spring_playground.entities.Order;
import io.nascimento.spring_playground.entities.User;
import io.nascimento.spring_playground.repositories.OrderRepository;
import io.nascimento.spring_playground.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String...args) throws Exception {
		
		User u1 = new User(null, "Flavio Nascimento", "flavio@mail.com", "83999999999", "123123");
		User u2 = new User(null, "Gabriel Manasses", "gabriel@mail.com", "83999999999", "321321");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u1);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u2);

		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
}
