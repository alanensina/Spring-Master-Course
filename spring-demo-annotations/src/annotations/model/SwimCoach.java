package annotations.model;

import annotations.Coach;
import annotations.FortuneService;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters like Michael Phelps just to warm up!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
