package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();
    private static final int DEFAULT_MAX = 100; // Стандартный верхний предел

    public static int getRandomNumber(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }

    public static int getRandomNumber(int max) {
        return getRandomNumber(1, max);
    }

    public static int getRandomNumber() {
        return getRandomNumber(1, DEFAULT_MAX);
    }
}
