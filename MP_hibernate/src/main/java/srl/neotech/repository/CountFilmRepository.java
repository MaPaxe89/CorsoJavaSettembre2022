package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.Movie;
import srl.neotech.entity.Person;

public interface CountFilmRepository extends JpaRepository <Movie, Integer> {
	
	@Query( value="select person.person_id, person.person_name, count(movie_cast.movie_id)"
			+ "FROM person"
			+ "JOIN movie_cast ON person.person_id = movie_cast.person_id"
			+ "GROUP BY person.person_id, person.person_name", nativeQuery= true)					
		public List<Movie> getCountFilm(String actor);
}
