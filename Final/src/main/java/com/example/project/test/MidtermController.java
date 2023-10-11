package com.example.project.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MidtermController {
	@PostMapping(value = "/midsave")
	public void midtermanswer(@RequestBody Midterm mid) {
		MidtermDA midd = new MidtermDA();
		midd.Midtermsave(mid);
	}

	@GetMapping(value = "/midresult/{mexamid}/{tid}")
	public Midterm midresultById(@PathVariable("mexamid") String mexamid, @PathVariable("tid") int tid) {
		Midterm mid;
		MidtermDA midd = new MidtermDA();
		mid = midd.midResultById(mexamid, tid);
		return mid;
	}

}

//public class PaymentController {
//@GetMapping (value = "/paysearch/{tid}")
//public Payment getPaymentById(@PathVariable("tid") int tid) {
//	Payment pa;
//	PaymentDA pad = new PaymentDA();
//	pa = pad.paymentById(tid);
//	return pa;
//}
//}
