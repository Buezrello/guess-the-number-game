package igor.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // create context (container)
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        // get number generator from context (container)
        INumberGenerator numberGenerator
                = context.getBean(INumberGenerator.class);

        // call method next() to get random number
        int number = numberGenerator.next();

        // log generated number
        log.info("number {}", number);

        // get game bean from context (container)
        IGame game
                = context.getBean(IGame.class);

         // call reset method
//        game.reset();

        // close context (container)
        context.close();

    }
}
