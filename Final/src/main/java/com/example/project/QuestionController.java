package com.example.project;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class QuestionController {
	@PostMapping(value="/qsave")
	public void qsave(@RequestBody Question q) {
		QuestionDA qd = new QuestionDA();
		qd.qusave(q);
		
	}
	

}
