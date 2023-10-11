package com.example.project;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class AssessmentController {
	
	@PostMapping(value="/qasave")
	public void asssave(@RequestBody Assessment as) {
		AssessmentDA asd = new AssessmentDA();
		asd.assave(as);
	}
}

