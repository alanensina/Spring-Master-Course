package annotations.model;

import annotations.FortuneService;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is not my lucky day, it's so sad!";
    }

}
