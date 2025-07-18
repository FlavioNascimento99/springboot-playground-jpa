package io.nascimento.spring_playground.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.nascimento.spring_playground.entities.User;
import io.nascimento.spring_playground.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String...args) throws Exception {
		
		User u1 = new User(null, "Flavio Nascimento", "flavio@mail.com", "83999999999", "123123");
		User u2 = new User(null, "Gabriel Manasses", "gabriel@mail.com", "83999999999", "321321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
}
