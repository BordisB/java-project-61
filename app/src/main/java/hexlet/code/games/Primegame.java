package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Primegame {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.getRandomNumber(1, MAX_NUMBER);
            String question = Integer.toString(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";
            roundsData[i] = new String[]{question, correctAnswer};
        }

        Engine.runGame(RULES, roundsData);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
