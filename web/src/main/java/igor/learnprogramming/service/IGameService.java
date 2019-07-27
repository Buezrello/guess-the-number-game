package igor.learnprogramming.service;

public interface IGameService {

    boolean isGameOver();
    String getMainMessage();
    String getResultMessage();
    void checkGuess(int guess);
    void reset();

}
