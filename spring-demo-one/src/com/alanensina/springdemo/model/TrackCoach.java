package com.alanensina.springdemo.model;

import com.alanensina.springdemo.interfaces.Coach;
import com.alanensina.springdemo.service.FortuneService;

public class TrackCoach implements Coach {

    // Define a private field for the dependency
    private FortuneService service;

    // Define a constructor for dependency injection
    public TrackCoach(FortuneService service) {
        this.service = service;
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it! " + service.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }
}
