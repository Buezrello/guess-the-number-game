package igor.learnprogramming;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Getter
@Component
public class NumberGeneratorImpl implements INumberGenerator {

    // == fields ==
    private final int maxNumber;
    private final int minNumber;

    // == constructors ==
    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    @Override
    public int next() {
        return ThreadLocalRandom.current().nextInt(minNumber, maxNumber + 1);
    }
}
