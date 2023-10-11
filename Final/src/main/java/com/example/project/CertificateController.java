package com.example.project;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class CertificateController {
	@GetMapping(value = "/certificate/{tid}")
	public Certificate getcertificatebyId (@PathVariable("tid") int tid) {
		Certificate cer;
		CertificateDA ced = new CertificateDA();
		cer = ced.certifcateByid(tid);
		return cer;
	}
	

}


////	@GetMapping(value ="/profilesearch/{tid}")
//public Profile getProfileById (@PathVariable("tid")int tid) {
//	Profile pro;
//	ProfileDA profileda = new ProfileDA();
//	pro = profileda.traineeprofileById(tid);
//	return pro;
//}