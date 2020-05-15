package annotations.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import annotations.Coach;
import annotations.FortuneService;

@Component
public class SoccerCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your free kick!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
