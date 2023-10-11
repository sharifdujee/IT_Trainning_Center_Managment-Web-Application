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
public class AdminController {
	
	List<Admin> adList = new ArrayList<>();
	@RequestMapping(value="/aall")
	public List<Admin> allAdmin(){
		AdminDA sa = new AdminDA();
		adList = sa.allAdmin();
		return adList;
		
	}
	@GetMapping (value = "/admin/{id}")
	public Admin getAdminById(@PathVariable("id") int id) {
		Admin a;
		AdminDA ad = new AdminDA();
		a = ad.AdminById(id);
		return a;
	}
	
	@PostMapping(value ="/asave")
	public void save(@RequestBody Admin a) {
		AdminDA  sa = new AdminDA();
		sa.save(a);
	}
	
	@PostMapping(value="/adupdate")
	public void adminupdate(@RequestBody Admin a ) {
		AdminDA ad = new AdminDA();
		ad.Adupdate(a);
		
		
	}
	@PostMapping(value="/dadmin")
	public void admindelete(@RequestBody Admin a) {
		AdminDA ad = new AdminDA();
		ad.addelete(a);
	}

	@GetMapping (value = "/adsearch/{id}")
	public Admin adsearch(@PathVariable("id") int id) {
		Admin a;
		AdminDA ad = new AdminDA();
		 a= ad.search(id);
		return a;
	}


}

