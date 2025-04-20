package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class IsEvenGame {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public static void start() {
        String[][] roundsData = generateRoundsData();
        Engine.runGame(RULES, roundsData);
    }

    private static String[][] generateRoundsData() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.getRandomNumber(MAX_NUMBER);
            String question = Integer.toString(number);
            String answer = isEven(number) ? "yes" : "no";
            roundsData[i] = new String[] {question, answer};
        }

        return roundsData;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
