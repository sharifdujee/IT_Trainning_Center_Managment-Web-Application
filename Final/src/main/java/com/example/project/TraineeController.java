package com.example.project;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TraineeController {
	List<Trainee>trList = new ArrayList<>();
	@GetMapping(value ="/trall")
	public List<Trainee> allTrainee(){
		TraineeDA td = new TraineeDA();
		trList = td.allTrainee();
		return trList;	
	}

	@GetMapping (value = "/trainee/{tid}")
	public Trainee getTraineeById(@PathVariable("tid")int tid) {
		Trainee t;
		TraineeDA td = new TraineeDA();
		t = td.TraineeById(tid);
		return t;
	

}
	@PostMapping(value = "/tsave")
	public Trainee save(@RequestBody Trainee t) {
		TraineeDA td = new TraineeDA();
		Trainee tr = td.tsave(t);
		return tr;
	}
	@PostMapping(value="/tsigin")
	public Trainee sigininTrainee(@RequestBody Trainee t) {
		TraineeDA td = new TraineeDA();
		Trainee ts = td.tsignin(t.tid);
		return ts;
	}
//	@PostMapping(value="/singin")
//	public Customer singinCustomer(@RequestBody Customer s) {
//		CustomerDA d= new CustomerDA();
//		Customer st=d.singin(s.id);
//		return st;
//		
//	}
	
	
	@PostMapping(value="/tupdate")
	public void tupdate(@RequestBody Trainee t) {
		TraineeDA td = new TraineeDA();
		td.trupdate(t);
	}
	@PostMapping(value="/tdelete")
	public void ttdelete(@RequestBody Trainee t) {
		TraineeDA td = new TraineeDA();
		td.trdelete(t);
	}
}

//@PostMapping(value = "/update")
//public void update(@RequestBody Admin1 a) {
//	AdminDA u = new AdminDA();
//	u.update(a);
//}
//
//@PostMapping(value = "/delete")
//public void delete(@RequestBody Admin a) {
//	AdminDA d = new AdminDA();
//	d.delete(a);
//}
//}



