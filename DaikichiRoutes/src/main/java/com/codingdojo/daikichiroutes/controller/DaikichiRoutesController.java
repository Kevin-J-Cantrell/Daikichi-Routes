package com.codingdojo.daikichiroutes.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
}