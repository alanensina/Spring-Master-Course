package annotations.model;

import org.springframework.stereotype.Component;

import annotations.FortuneService;

@Component
public class RESTFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "RESTFortuneService: getFortune()";
    }

}
