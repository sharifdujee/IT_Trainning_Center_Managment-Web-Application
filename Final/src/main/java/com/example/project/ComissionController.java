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

public class ComissionController {
	List<Comission> cList = new ArrayList<>();
	@RequestMapping (value="/comshow")
	public List <Comission> allComission(){
		ComissionDA cd = new ComissionDA();
		cList = cd.allComission();
		return cList;
	}
	@GetMapping(value = "/comission/{tid}")
	public Comission getComissionById(@PathVariable("tid") int tid) {
		Comission co;
		ComissionDA cd = new ComissionDA();
		co = cd.ComissionById(tid);
		return co;	
		
	}
	@PostMapping (value= "/comsave")
	public void comsave(@RequestBody Comission co) {
		ComissionDA cd = new ComissionDA();
		cd.cosave(co);
	}
	@GetMapping(value= "/getcomission/{tid}")
	public Comission getsComissionById(@PathVariable("tid") int tid) {
		Comission com;
		ComissionDA cod = new ComissionDA();
		com = cod.scmarks(tid);
		return com;
	}
	
}
 
