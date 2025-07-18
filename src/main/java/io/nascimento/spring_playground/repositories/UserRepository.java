package io.nascimento.spring_playground.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.nascimento.spring_playground.entities.User;


// Não vamos precisar criar implementações, apesar de ser uma Interface
public interface UserRepository extends JpaRepository<User, Long>{

}
