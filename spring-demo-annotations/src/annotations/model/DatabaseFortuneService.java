package annotations.model;

import org.springframework.stereotype.Component;

import annotations.FortuneService;

@Component
public class DatabaseFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "DatabaseFortuneService: getFortune()";
    }

}
