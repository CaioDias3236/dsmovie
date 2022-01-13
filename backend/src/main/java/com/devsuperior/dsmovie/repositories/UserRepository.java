package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.User;

//acessar filme no banco de dados
public interface UserRepository extends JpaRepository<User, Long>{
	
	//busca bd por email padrao jpa
	User findByEmail(String email);
	
}
