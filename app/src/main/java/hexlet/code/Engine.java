package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void runGame(String rules, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        for (String[] round : roundsData) {
            String question = round[0];
            String correctAnswer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String userAnswer = scanner.nextLine().trim();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'%n",
                        userAnswer, correctAnswer);
                System.out.printf("Let's try again, %s!%n", userName);
                scanner.close();
                return;
            }

            System.out.println("Correct!");
        }

        System.out.printf("Congratulations, %s!%n", userName);
        scanner.close();
    }
}
