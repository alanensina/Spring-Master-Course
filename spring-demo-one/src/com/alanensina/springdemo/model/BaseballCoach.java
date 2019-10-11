package com.alanensina.springdemo.model;

import com.alanensina.springdemo.interfaces.Coach;
import com.alanensina.springdemo.service.FortuneService;

public class BaseballCoach implements Coach {

	// Define a private field for the dependency
	private FortuneService service;

	// Define a constructor for dependency injection
	public BaseballCoach(FortuneService service) {
		this.service = service;
	}
	
	public BaseballCoach() {}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return "Here we go! " + service.getFortune();
	}

}
