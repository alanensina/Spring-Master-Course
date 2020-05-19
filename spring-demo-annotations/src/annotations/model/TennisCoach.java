package annotations.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import annotations.Coach;
import annotations.FortuneService;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    public TennisCoach() {
        System.out.println("TennisCoach: Inside of default constructor.");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println("TennisCoach: Inside of doSomeCrazyStuff()");
//        this.fortuneService = fortuneService;
//    }

}
