package com.alanensina.springdemo.model;

import com.alanensina.springdemo.interfaces.Coach;
import com.alanensina.springdemo.service.FortuneService;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;	

	// Create a no-arg constructor
	public CricketCoach() {
		System.out.println("No-arg constructor created.");
	}
	
	// Our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside of the setter method!");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
