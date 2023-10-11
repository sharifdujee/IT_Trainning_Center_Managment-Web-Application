package com.example.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PaymentController {
	List<Payment> showpayment = new ArrayList<>();
	@RequestMapping(value="/payall")
	public List<Payment> allpay(){
		PaymentDA pad = new PaymentDA();
		showpayment = pad.paymentall();
		return showpayment;
		
	}
	@GetMapping (value = "/paysearch/{tid}")
	public Payment getPaymentById(@PathVariable("tid") int tid) {
		Payment pa;
		PaymentDA pad = new PaymentDA();
		pa = pad.paymentById(tid);
		return pa;
	}
	@PostMapping(value="/paymentsave")
	public void paysave(@RequestBody Payment pa) {
		PaymentDA pad = new PaymentDA();
		pad.paymentsave(pa);
	}
	
	@PostMapping(value="/updatestatus")
	public void statusupdate(@RequestBody Payment pa) {
		PaymentDA pad = new PaymentDA();
		pad.updateById(pa);
	}

}

//List<Admin> adList = new ArrayList<>();
//@RequestMapping(value="/aall")
//public List<Admin> allAdmin(){
//	AdminDA sa = new AdminDA();
//	adList = sa.allAdmin();
//	return adList;
//	
//}

