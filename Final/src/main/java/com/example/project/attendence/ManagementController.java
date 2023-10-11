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


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ManagementController {
	List<Management> admanagement = new ArrayList<>();
	@RequestMapping (value="/managementall")
	public List<Management> allManagements(){
		ManagementDA mana = new ManagementDA();
	admanagement = mana.allmanagement();
	return admanagement;
	}
	@GetMapping (value = "/management/{tid}")
	public Management managementById(@PathVariable("tid") int tid) {
		Management ma;
		ManagementDA  mad = new ManagementDA();
		ma = mad.allmanagementById(tid);
		return ma;
	}
	
	
	@PostMapping(value="/managementsave")
	public void savemanagement(@RequestBody Management mana) {
		ManagementDA manag = new ManagementDA();
		manag.Savemanagement(mana);
	}

}

//
