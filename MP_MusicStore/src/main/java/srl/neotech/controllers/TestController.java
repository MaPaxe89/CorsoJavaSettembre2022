package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	
	@RequestMapping(value="listMusic")
	public String listMusic(){
		
		return "listMusic";
	}
	
	@RequestMapping(value="detailMusic")
	public String detailMusic(){
		
		return "detailMusic";
	}
	
}
