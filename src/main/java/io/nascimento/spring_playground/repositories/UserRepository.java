package io.nascimento.spring_playground.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.nascimento.spring_playground.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	/**
	 * 	Aqui não é necessário nenhuma anotação como @Repository, por exemplo
	 * 	Isso se dá porque essa interface já extende de @JpaRepository que por sua vez 
	 * 	já possui tal notação.
	 * */
}
