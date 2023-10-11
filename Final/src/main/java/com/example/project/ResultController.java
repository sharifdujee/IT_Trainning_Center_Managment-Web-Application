package com.example.project;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class ResultController {
	
	@GetMapping(value="/result/{tid}")
	public Result getResultById(@PathVariable("tid") int tid) {
		Result res;
		ResultDA rd = new ResultDA();
		res= rd.ResultById(tid);
		return res;
		
	}
	
	@PostMapping (value="/resave")
	public void resave(@RequestBody Result rs) {
		ResultDA rd = new ResultDA();
		rd.rsave(rs);
	}
}

