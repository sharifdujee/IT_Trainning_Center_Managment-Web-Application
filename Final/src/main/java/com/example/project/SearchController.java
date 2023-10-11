package com.example.project;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SearchController {
	@GetMapping(value ="/search/{id}")
	public Search getDetailsById(@PathVariable("id") int id) {
		Search se ;
		SearchDA sd = new SearchDA();
		se = sd.searchById(id);
		return se;
	}

}
