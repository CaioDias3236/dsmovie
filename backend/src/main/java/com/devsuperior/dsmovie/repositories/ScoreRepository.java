package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.ScorePk;

//acessar filme no banco de dados
public interface ScoreRepository extends JpaRepository<Score, ScorePk >{
}
