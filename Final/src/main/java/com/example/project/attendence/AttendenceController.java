package com.example.project.attendence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Payment;
import com.example.project.PaymentDA;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AttendenceController {
	List<Attendence> adattendence = new ArrayList<>();
	@RequestMapping(value="/atall")
	public List<Attendence> allAttendence(){
		AttendenceDA atd = new AttendenceDA();
		adattendence = atd.allattendence();
		return adattendence;
	}
	
	@GetMapping (value ="/attendencesearch/{tid}")
	public List<Attendence> getAttendenceById(@PathVariable("tid")int tid){
		List<Attendence> showattList = new ArrayList<>();
		AttendenceDA attendenceprofile = new AttendenceDA();
		return showattList = attendenceprofile.attendenceById(tid);
	}
	
	@PostMapping(value= "/saveattendence")
	public void attendencesave(@RequestBody Attendence atd) {
		AttendenceDA att = new AttendenceDA();
		att.saveattendence(atd);
	}
	@GetMapping (value="/attendenceSearch/{date}")
	public List<Attendence> getattendenceByDate(@PathVariable("date") String date){
		List<Attendence> showattendenceList = new ArrayList<>();
		AttendenceDA attendencedate = new AttendenceDA();
		return showattendenceList = attendencedate.attendenceByDate(date);
	}
	@GetMapping(value="Present/{status}")
	public Attendence getStatusByID(@PathVariable("status")String status) {
		Attendence att;
		AttendenceDA atd = new AttendenceDA();
		att = atd.attendenceByStatus(status);
		return att;
		
	}
	
	
	

}

//@GetMapping (value = "/paysearch/{tid}")
//public Payment getPaymentById(@PathVariable("tid") int tid) {
//	Payment pa;
//	PaymentDA pad = new PaymentDA();
//	pa = pad.paymentById(tid);
//	return pa;
//}

