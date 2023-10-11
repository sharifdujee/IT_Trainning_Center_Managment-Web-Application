package com.example.project.result;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Admin;
import com.example.project.AdminDA;
import com.example.project.Payment;
import com.example.project.PaymentDA;
import com.example.project.attendence.Attendence;
import com.example.project.attendence.AttendenceDA;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class ProgressController {
	List<Progress> progressList = new ArrayList<>();
	@RequestMapping (value="/allprogress")
	public List<Progress> allprogress(){
		ProgressDA prg = new ProgressDA();
		progressList = prg.allprogress();
		return progressList;
		
		
	}
	@GetMapping(value ="/allprogress/{tid}")
	public List<Progress> getProgressById(@PathVariable ("tid") int tid){
		List<Progress> progressList = new ArrayList<>();
		ProgressDA prd = new ProgressDA();
		return progressList = prd.progressById(tid);
		
	}
	@PostMapping(value="/saveprogress")
	public void progresssave(@RequestBody Progress prg) {
		ProgressDA prd = new ProgressDA();
		prd.saveprogress(prg);
	}
	
	@GetMapping(value="/searchprogress/{tid}")
		public Progress getprogressById(@PathVariable ("tid") int tid) {
		Progress prg;
		ProgressDA prd = new ProgressDA();
		prg = prd.ProgressById(tid);
		return prg;
	}
	@PostMapping(value="/updateprogress")
	public void progressupdate(@RequestBody Progress prg) {
		ProgressDA prd = new ProgressDA();
		prd.ProgressUpdate(prg);
	}
	@PostMapping(value="/dprogress")
	public void Progressdelete(@RequestBody Progress pa) {
		ProgressDA prd = new ProgressDA();
		prd.deleterecord(pa);
		
	}
 
}

////@PostMapping(value="/adupdate")
//public void adminupdate(@RequestBody Admin a ) {
//	AdminDA ad = new AdminDA();
//	ad.Adupdate(a);
//	
//	
//}
//}

