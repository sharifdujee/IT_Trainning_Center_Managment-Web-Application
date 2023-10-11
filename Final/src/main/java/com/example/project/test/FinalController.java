package com.example.project.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FinalController {
	
	@PostMapping(value="/finalsave")
	public void fianlanswer(@RequestBody Final fin) {
		FinalDA fina = new FinalDA();
		fina.savefinal(fin);
	}
	@GetMapping(value="/finalresult/{fexamid}/{tid}")
	public Final finalresultById (@PathVariable("fexamid")String fexamid, @PathVariable("tid") int tid) {
		Final fin;
		FinalDA fina = new FinalDA();
		fin = fina.finalResultById(fexamid,tid);
		return fin;
	}



}

