package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.Movie;

public interface BPActionRepository extends JpaRepository<Movie,Integer>{
	
	@Query( value="select movie.* from movie\n"
			+ "Join movie_cast on movie.movie_id = movie_cast.movie_id\n"
			+ "Join person on person.person_id = movie_cast.person_id\n"
			+ "Join movie_genres on movie.movie_id = movie_genres.movie_id\n"
			+ "Join genre on genre.genre_id = movie_genres.genre_id\n"
			+ "where person.person_name = \"Brad Pitt\" and\n"
			+ "genre.genre_name = \"Action\";", nativeQuery = true )
	public List<Movie> getMovieBradAction(String actor, String genre);	

}
