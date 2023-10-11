package com.example.project.result;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class InvoiceController {
	@GetMapping(value="/invoice/{tid}")
	public Invoice getInvoiceById(@PathVariable("tid") int tid) {
		Invoice inv;
		InvoiceDA inda = new InvoiceDA();
		inv = inda.invoiceById(tid);
		return inv;
	}

}
//@GetMapping(value ="/profilesearch/{tid}")
//public Profile getProfileById (@PathVariable("tid")int tid) {
//	Profile pro;
//	ProfileDA profileda = new ProfileDA();
//	pro = profileda.traineeprofileById(tid);
//	return pro;
//}