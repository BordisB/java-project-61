package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {

    private static final String RULES = "What is the result of the expression?";
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int num1 = Utils.getRandomNumber(1, 25);
            int num2 = Utils.getRandomNumber(1, 25);
            char operator = OPERATORS[Utils.getRandomNumber(0, OPERATORS.length - 1)];

            String question = num1 + " " + operator + " " + num2;
            String correctAnswer = calculate(num1, num2, operator);

            roundsData[i] = new String[]{question, correctAnswer};
        }

        Engine.runGame(RULES, roundsData);
    }

    private static String calculate(int num1, int num2, char operator) {
        return switch (operator) {
            case '+' -> String.valueOf(num1 + num2);
            case '-' -> String.valueOf(num1 - num2);
            case '*' -> String.valueOf(num1 * num2);
            default -> throw new RuntimeException("Unknown operator: " + operator);
        };
    }
}
