package annotations.model;

import java.util.Random;

import org.springframework.stereotype.Component;

import annotations.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {
    private String[] data = {
            "Bewere of the wolf in sheep's clothing!",
            "Diligence is the mother of good luck!",
            "The journey is the reward!"
    };

    @Override
    public String getFortune() {
        return data[new Random().nextInt(data.length)];
    }

}
