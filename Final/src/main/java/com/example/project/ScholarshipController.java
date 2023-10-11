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
public class ScholarshipController {
	List<Scholarship> scList = new ArrayList<>();
	@RequestMapping(value="/schshow")
	public  List <Scholarship> allscholarship(){
		ScholarshipDA scd = new ScholarshipDA();
		scList = scd.allScholarship();
		return scList;	
	}
	@GetMapping (value = "/scholarship/{tid}")
	public Scholarship getScholarshipById(@PathVariable("tid") int tid) {
		Scholarship sc;
		ScholarshipDA scd = new ScholarshipDA();
		sc = scd.ScholarshipById(tid);
		return sc;
	}
	@PostMapping(value= "/schsave")
	public void scSave(@RequestBody Scholarship sc) {
		ScholarshipDA scd= new ScholarshipDA();
		scd.scsave(sc);
	}
	@PostMapping( value = "/schdelete")
	public void scdelete(@RequestBody Scholarship sc) {
		ScholarshipDA scd = new ScholarshipDA();
		scd.schdelete(sc);
		
	}
	@GetMapping(value= "/getmarks/{tid}")
	public Scholarship getsMarksById(@PathVariable("tid") int tid) {
		Scholarship sc;
		ScholarshipDA sd = new ScholarshipDA();
		sc = sd.smarks(tid);
		return sc;
	}
	
}




