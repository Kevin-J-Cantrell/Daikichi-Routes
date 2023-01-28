package com.codingdojo.daikichiroutes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikkichi")
public class DaikichiRoutesController {
	
	@GetMapping("")
	public String first() {
	return "Welcome!";
	}
	
	@GetMapping("/today")
	public String second() {
		return "Today you find luck in all your indeavors!";
	}
	
	@GetMapping("/tomorrow")
	public String third() {
		return "tomorrow, an opportunity will arise, so be sure to be open to ne ideas!";
	}
	
	@GetMapping("/travel/{location}")
	public String showLesson(@PathVariable("location") String location){
		return "Congratulations you will soon trvel to " + location ;
		
	}
	@GetMapping("/lotto/{num}")
	    public String showLesson(@PathVariable("num") int num){
		String result = "";
		if(num %2 == 0 ) {
			result = "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else {
			result = "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	    	return result;
	    																							//text that says 'You will take a grand
	   }
}
