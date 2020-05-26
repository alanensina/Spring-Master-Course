package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import annotations.model.SadFortuneService;
import annotations.model.SwimCoach;

@Configuration
//@ComponentScan("annotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // Define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // Define bean for our swim coach and inject dependendy
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
