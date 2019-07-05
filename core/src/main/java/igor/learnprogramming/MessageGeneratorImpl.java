package igor.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements IMessageGenerator {

    // == constants ==
    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    // == fields ==
    @Autowired
    private IGame game;
    private int guessCount = 10;

    // == init ==
    @PostConstruct
    public void postConstruct() {
        log.debug("the number from class GameImpl equals {}",
                game.getNumber());
    }

    // == public methods ==
    @Override
    public String getMainMessage() {
        return "call getMainMessage() method";
    }

    @Override
    public String getResultMessage() {
        return "call getResultMessage() method";
    }
}
