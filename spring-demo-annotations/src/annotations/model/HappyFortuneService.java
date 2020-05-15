package annotations.model;

import org.springframework.stereotype.Component;

import annotations.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is yout lucky day!";
    }

}
