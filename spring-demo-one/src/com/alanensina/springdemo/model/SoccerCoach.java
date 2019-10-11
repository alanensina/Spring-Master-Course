package com.alanensina.springdemo.model;

import com.alanensina.springdemo.interfaces.Coach;
import com.alanensina.springdemo.service.FortuneService;

public class SoccerCoach implements Coach {

	// Define a private field for the dependency
	private FortuneService service;

	// Define a constructor for dependency injection
	public SoccerCoach(FortuneService service) {
		this.service = service;
	}

	public SoccerCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Let's get start! 1.5k running and let's go to the match!";
	}

	@Override
	public String getDailyFortune() {

		// Use my service to get the fortune
		return "Come on boy! " + service.getFortune();
	}

}
