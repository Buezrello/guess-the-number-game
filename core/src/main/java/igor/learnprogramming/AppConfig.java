package igor.learnprogramming;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "igor.learnprogramming")
public class AppConfig {

    // == bean methods ==
    @Bean
    public INumberGenerator numberGenerator() {
        return new NumberGeneratorImpl();
    }

    @Bean
    public IGame game() {
        return new GameImpl();
    }
}
