package igor.learnprogramming;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGeneratorImpl implements INumberGenerator {

    // == fields ==
    private final Random random = new Random();

    @Autowired
    @MaxNumber
    private int maxNumber;

    @Autowired
    @MinNumber
    private int minNumber;

    @Override
    public int next() {
        return ThreadLocalRandom.current().nextInt(minNumber, maxNumber + 1);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }

    @Override
    public int getMinNumber() {
        return minNumber;
    }
}
