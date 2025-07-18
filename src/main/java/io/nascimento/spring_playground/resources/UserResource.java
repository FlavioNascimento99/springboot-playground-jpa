package io.nascimento.spring_playground.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.nascimento.spring_playground.entities.User;

@RestController
@RequestMapping(value="/Users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User exampleUser = new User(1L, "Flavio", "flavio@mail.com", "99 9 99999999", "senhaSegura123");
		return ResponseEntity.ok().body(exampleUser);
	}
	
}
 	