package com.auladevsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auladevsuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
