package srl.neotech.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.dto.DepartmentDTO;
import srl.neotech.dto.MovieDTO;
import srl.neotech.dto.ProductionCompanyDTO;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.MovieService;

@RestController
public class MovieController {
	
	
	@Autowired
	MovieService ms;
	
	@GetMapping("/getMovieBrad")
	public ResponseBase getMovieBrad(@RequestParam("actor") String actor) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<MovieDTO> films=ms.getMovieBrad(actor);
			response.setSimpleData(films);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
	
	@GetMapping("/getMovieBradAction")
	public ResponseBase getMovieBradAction(@RequestParam("actor") String actor, @RequestParam("genre") String genre) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<MovieDTO> films=ms.getMovieBradAction(actor, genre);
			response.setSimpleData(films);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block v 
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
	
	@GetMapping("/getProductionBudget")
	public ResponseBase getProductionBudget(@RequestParam("budget") Integer budget) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<ProductionCompanyDTO> company = ms.getProductionBudget(budget);
			response.setSimpleData(company);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block v 
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
	
	@GetMapping("/getDPActor")
	public ResponseBase getDPActor(@RequestParam("role") String role) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<DepartmentDTO> departments = ms.getDPActor(role);
			response.setSimpleData(departments);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block v 
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
	
	@GetMapping("/getCountFilm")
	public ResponseBase getCountFilm(@RequestParam("actor") String actor) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<MovieDTO> listaMovieDTO = ms.getCountFilm(actor);
			response.setSimpleData(listaMovieDTO);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block v 
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
	
	
	
	
}
