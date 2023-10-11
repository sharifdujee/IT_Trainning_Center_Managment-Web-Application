package com.example.project;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class TraineeLoginController {
	@PostMapping(value="/trlogin")
	public TraineeLogin trlogin(@RequestBody TraineeLogin tl) {
		TraineeLoginDA ad = new TraineeLoginDA();
		return ad.trlog(tl);
	}

	@PostMapping(value="/examlogin")
	public TraineeLogin examlogin(@RequestBody TraineeLogin t1) {
		TraineeLoginDA ad = new TraineeLoginDA();
		return ad.examlogin(t1);
	}
	@PostMapping(value="/midlogin")
	public TraineeLogin midtermlogin(@RequestBody TraineeLogin t1) {
		TraineeLoginDA ad = new TraineeLoginDA();
		return ad.midlogin(t1);
	}
	

}


