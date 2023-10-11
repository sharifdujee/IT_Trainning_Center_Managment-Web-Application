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
public class CourseController {
	

	List<Course> courseList = new ArrayList<>();
	@RequestMapping(value="/allcourse")
	public List<Course> allCourse(){
		CourseDA cod = new CourseDA();
		courseList = cod.allCourse();
		return courseList;
		
	}
	@PostMapping(value="/csave")
	public void csave(@RequestBody Course c) {
		CourseDA cd = new CourseDA();
		cd.add(c);
		
	}
	
	@GetMapping(value="/searchcourse/{cid}")
	public Course courseById(@PathVariable("cid")int cid) {
		Course ca;
		CourseDA cd = new CourseDA();
		ca = cd.coursePriceById(cid);
		return ca;
	}

}

