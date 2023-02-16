package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.Movie;
import srl.neotech.entity.Person;

public interface DPActorRepository extends JpaRepository <Person, Integer> {
	
	@Query( value="select DISTINCT person.person_name, department.department_name\n"
			+ "from movie\n"
			+ "join movie_cast on movie.movie_id = movie_cast.movie_id\n"
			+ "join person on movie_cast.person_id = person.person_id\n"
			+ "join movie_crew on person.person_id = movie_crew.person_id\n"
			+ "join department on movie_crew.department_id = department.department_id\n"
			+ "WHERE (department.department_name = \"Production\") or (department.department_name=\"Directing\");", nativeQuery = true)		
				
		public List<Person> getDPActor(String role);

	

}
