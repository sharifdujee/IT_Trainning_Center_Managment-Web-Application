package com.example.project.result;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class ProfileController {
	List<Profile> resultList = new ArrayList<>();
	@RequestMapping(value="/resultall")
	public List<Profile> allProfile(){
		ProfileDA prd = new ProfileDA();
		resultList = prd.allresult();
		return resultList;
	}
	
	@GetMapping(value ="/profilesearch/{tid}")
	public Profile getProfileById (@PathVariable("tid")int tid) {
		Profile pro;
		ProfileDA profileda = new ProfileDA();
		pro = profileda.traineeprofileById(tid);
		return pro;
	}
	
	
	@GetMapping (value ="/resultsearch/{tid}")
	public List <Profile> getResultById(@PathVariable("tid") int tid) {
		List<Profile> showList = new ArrayList<>();
		ProfileDA resultprofile = new ProfileDA();
		return showList = resultprofile.resultById(tid);
		
	}

}





