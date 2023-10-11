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


public class SuggestionController {
	List<Suggestion>suList = new ArrayList<>();
	@RequestMapping(value="/suggestionshow")
	public List<Suggestion>allsuggestion(){
		SuggestionDA sud = new SuggestionDA();
		suList = sud.allsugesstion();
		return suList;	
	}
	@GetMapping (value= "/getcourse/{tid}")
	public Suggestion getCourseById(@PathVariable("tid") int tid) {
		Suggestion sug;
		SuggestionDA sud = new SuggestionDA();
		sug = sud.SuggestionById(tid);
		return sug;
	}


@GetMapping(value= "/getklevel/{tid}")
public Suggestion getsKlevelById(@PathVariable("tid") int tid) {
	Suggestion sug;
	SuggestionDA sud = new SuggestionDA();
	sug = sud.cklevel(tid);
	return sug;
}

	@PostMapping(value = "/susave")
	public void csuggestion(@RequestBody Suggestion se) {
		SuggestionDA sd = new SuggestionDA();
		sd.sugsave(se);
	}
	
	
}


