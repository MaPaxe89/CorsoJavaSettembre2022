package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.CountFilmDAO;
import srl.neotech.dao.DPActorDAO;
import srl.neotech.dao.MovieBradActionDAO;
import srl.neotech.dao.MovieBradDAO;
import srl.neotech.dao.ProductionBudgetDAO;
import srl.neotech.dto.DepartmentDTO;
import srl.neotech.dto.MovieDTO;
import srl.neotech.dto.ProductionCompanyDTO;
import srl.neotech.entity.Movie;
import srl.neotech.entity.Person;
import srl.neotech.entity.ProductionCompany;

@Service
public class MovieService {
	
	@Autowired
	MovieBradDAO movieDAO;
	
	@Autowired
	ModelMapper modelMapper;
	//movie brad	
	public List<MovieDTO> getMovieBrad(String actor) {
		List<Movie> movies=movieDAO.getMovieBrad(actor);
		List<MovieDTO> films=new ArrayList<>();
		for(Movie movie:movies) {
			films.add(modelMapper.map(movie, MovieDTO.class));
		}
		return films;
	}
	
	@Autowired
	MovieBradActionDAO movieAction;
	
	//movie brad action	
	public List<MovieDTO> getMovieBradAction(String actor, String genre) {
		List<Movie> movies=movieAction.getMovieBradAction(actor, genre);
		List<MovieDTO> films=new ArrayList<>();
		for(Movie movie:movies) {
			films.add(modelMapper.map(movie, MovieDTO.class));
		}
		return films;
	}
	
	@Autowired
	ProductionBudgetDAO productionDAO;
	
	public List<ProductionCompanyDTO> getProductionBudget(Integer budget) {
		List<ProductionCompany> productions = productionDAO.getProductionBudget(budget);	
		List<ProductionCompanyDTO> productionsDto=new ArrayList<>();
		for(ProductionCompany company:productions) {
			productionsDto.add(modelMapper.map(company, ProductionCompanyDTO.class));
		}
		return productionsDto;
		}
	
	
	@Autowired
	DPActorDAO dpaDAO;
		
	public List<DepartmentDTO> getDPActor(String role) {
		List<Person> listaPerson = dpaDAO.getDPActor(role);	
		List<DepartmentDTO> departments=new ArrayList<>();
		for(Person person:listaPerson) {
			departments.add(modelMapper.map(person, DepartmentDTO.class));
		}
		return departments;
		}
	
	@Autowired
	CountFilmDAO CountFilmDAO;
	
	public List<MovieDTO> getCountFilm(String actor) {
		List<Movie> listaMovie = CountFilmDAO.getCountFilmRepository(actor);
		List<MovieDTO> listaMovieDTO=new ArrayList<>();
		for(Movie movie:listaMovie) {
			listaMovieDTO.add(modelMapper.map(movie, MovieDTO.class));
		}
		return listaMovieDTO;
		}
	
	
	
	
	


}
