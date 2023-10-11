package com.example.project;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class AdminloginController {
	@PostMapping(value="/adlogin")
	public Adminlogin adlogin(@RequestBody Adminlogin al) {
		AdminloginDA ad = new AdminloginDA();
		return ad.log(al);
		}
}

//@PostMapping (value="/adminlogin")
//public Adminlogin addminlogin(@RequestBody Adminlogin adl) {
//	AdminloginDA ad = new AdminloginDA();
//	return ad.adminlog(adl);
//}


