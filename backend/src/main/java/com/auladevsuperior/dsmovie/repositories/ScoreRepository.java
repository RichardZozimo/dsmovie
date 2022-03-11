package com.auladevsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auladevsuperior.dsmovie.entities.Score;
import com.auladevsuperior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}