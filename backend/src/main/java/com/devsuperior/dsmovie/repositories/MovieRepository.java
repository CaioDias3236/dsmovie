package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

//acessar filme no banco de dados
public interface MovieRepository extends JpaRepository<Movie, Long>{
}
