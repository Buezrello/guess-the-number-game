package igor.learnprogramming.config;

import igor.learnprogramming.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(GameConfig.class)
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

    @Bean
    public IMessageGenerator messageGenerator() {
        return new MessageGeneratorImpl();
    }

}
