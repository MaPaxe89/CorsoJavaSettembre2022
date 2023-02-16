package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.Movie;
import srl.neotech.repository.BPActionRepository;
import srl.neotech.repository.BPRepository;

@Component
public class MovieBradDAO {
	
	@Autowired
	BPRepository bpr;	
	
	public List<Movie> getMovieBrad(String actor){
		return bpr.getMovieBrad(actor);
	}	
	

}
