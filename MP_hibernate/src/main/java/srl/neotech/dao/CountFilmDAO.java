package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.Movie;
import srl.neotech.repository.CountFilmRepository;

@Component
public class CountFilmDAO {
	
	@Autowired
	CountFilmRepository CountFilmRepository;
	
	public List<Movie> getCountFilmRepository(String actor){
		return  CountFilmRepository.getCountFilm(actor);
	}
	

}
