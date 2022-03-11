package com.auladevsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.auladevsuperior.dsmovie.dto.MovieDTO;
import com.auladevsuperior.dsmovie.dto.ScoreDTO;
import com.auladevsuperior.dsmovie.entities.Movie;
import com.auladevsuperior.dsmovie.entities.Score;
import com.auladevsuperior.dsmovie.entities.User;
import com.auladevsuperior.dsmovie.repositories.MovieRepository;
import com.auladevsuperior.dsmovie.repositories.ScoreRepository;
import com.auladevsuperior.dsmovie.repositories.UserRepository;

@Service
public class ScoreService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail());
		if(user == null ) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		
		score = scoreRepository.saveAndFlush(score);
		
		//função para calculo da media apos salvar dados da avaliação do filme
		double sum = 0.0;
		for (Score s : movie.getScores()) {
			sum += s.getValue();
		}
		
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie = movieRepository.save(movie);
		
		return new MovieDTO(movie);
	}
}
