package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();

    public static int getRandomNumber(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }

    public static int getRandomNumber(int max) {
        return getRandomNumber(1, max);
    }
}
