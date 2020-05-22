package annotations.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import annotations.Coach;
import annotations.FortuneService;

@Component
//@Scope("prototype")  default is Singleton
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

    // Define my init method
    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("TennisCoach: Inside of doMyStartUpStuff()");
    }

    // Define my destroy method
    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("TennisCoach: Inside of doMyCleanUpStuff()");
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
