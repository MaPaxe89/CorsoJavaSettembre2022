package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.ProductionCompany;
import srl.neotech.repository.ProduzioneRepository;

@Component
public class ProductionBudgetDAO {
	
	@Autowired
	ProduzioneRepository pr;	
	
	public List<ProductionCompany> getProductionBudget(Integer budget){
		return pr.getProductionBudget(budget);
	}	
	

}
