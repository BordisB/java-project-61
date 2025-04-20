package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GDC {
    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int num1 = Utils.getRandomNumber(1, 100);
            int num2 = Utils.getRandomNumber(1, 100);
            String question = num1 + " " + num2;
            String correctAnswer = String.valueOf(calculateGCD(num1, num2));
            roundsData[i] = new String[]{question, correctAnswer};
        }

        Engine.runGame(RULES, roundsData);
    }

    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}