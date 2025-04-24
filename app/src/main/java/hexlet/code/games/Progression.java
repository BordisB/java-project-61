package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int progressionLength = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
            int start = Utils.getRandomNumber();
            int step = Utils.getRandomNumber(1, 10);
            int hiddenIndex = Utils.getRandomNumber(0, progressionLength - 1);

            int[] progression = generateProgression(start, step, progressionLength);
            String question = buildQuestion(progression, hiddenIndex);
            String correctAnswer = String.valueOf(progression[hiddenIndex]);

            roundsData[i] = new String[]{question, correctAnswer};
        }

        Engine.runGame(RULES, roundsData);
    }

    private static int[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }

    private static String buildQuestion(int[] progression, int hiddenIndex) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenIndex) {
                sb.append(".. ");
            } else {
                sb.append(progression[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
