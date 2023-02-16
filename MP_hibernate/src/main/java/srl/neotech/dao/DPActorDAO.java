package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.Person;
import srl.neotech.repository.DPActorRepository;

@Component
public class DPActorDAO {

		@Autowired
		DPActorRepository DPActor;
		
		public List<Person> getDPActor (String role){
			return DPActor.getDPActor(role);
		}
	
	
}
