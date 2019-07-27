package igor.learnprogramming.service;

import igor.learnprogramming.IGame;
import igor.learnprogramming.IMessageGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class GameServiceImpl implements IGameService {

    // == fields ==
    private final IGame game;
    private final IMessageGenerator messageGenerator;

    // == constructors ==
    @Autowired
    public GameServiceImpl(IGame game, IMessageGenerator messageGenerator) {
        this.game = game;
        this.messageGenerator = messageGenerator;
    }

    // == public methods ==
    @PostConstruct
    public void init() {
        log.info("MAIN MESSAGE CALLED FROM GameServiceImpl: {}", getMainMessage());
        log.info("NUMBER WE HAVE TO GUESS IN GameServiceImpl: {}", game.getNumber());
    }

    @Override
    public boolean isGameOver() {
        return game.isGameWon() || game.isGameLost();
    }

    @Override
    public String getMainMessage() {
        return messageGenerator.getMainMessage();
    }

    @Override
    public String getResultMessage() {
        return messageGenerator.getResultMessage();
    }

    @Override
    public void checkGuess(int guess) {
        game.setGuess(guess);
        game.check();
    }

    @Override
    public void reset() {
        game.reset();
    }

}
