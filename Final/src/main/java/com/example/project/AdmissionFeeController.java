package com.example.project;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController

public class AdmissionFeeController {
	@PostMapping (value="/feesave")
	public void fsave(@RequestBody AdmissionFee af) {
		AdmissionFeeDA afd = new AdmissionFeeDA();
		afd.addfee(af);
	}

}

////
//////
////
////public class AdmissionController {
////	@PostMapping(value="/csave")
//public void csave(@RequestBody Course c) {
//	CourseDA cd = new CourseDA();
//	cd.add(c);
//	
//}
////	}

