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
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class AdmissionController {
	
	List<Admission> admissionList = new ArrayList<>();
	@RequestMapping(value="/admissiondetails")
	public List<Admission> alladmission(){
		AdmissionDA adm = new AdmissionDA();
		admissionList = adm.alladmission();
		return admissionList;
	}
	
	@GetMapping (value="/traineeDetails/{tid}")
	public List<Admission> getAdmissionById(@PathVariable("tid") int tid){
		List<Admission> admissionList = new ArrayList<>();
		AdmissionDA admd = new AdmissionDA();
		return admissionList = admd.admissionByid(tid);
	}
	
	
	@PostMapping(value="/admissionsave")
	public void SaveAdmission(@RequestBody Admission admi){
		AdmissionDA addm = new AdmissionDA();
		addm.admissionsave(admi);
		
	}
	@PostMapping(value="/deleteadmission")
	public void Deleteadmission(@RequestBody Admission ad) {
		AdmissionDA adm = new AdmissionDA();
		adm.deleteAdmission(ad);
	}
}





