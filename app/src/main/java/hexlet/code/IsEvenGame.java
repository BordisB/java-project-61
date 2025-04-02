package hexlet.code;

import java.util.Scanner;

public class IsEvenGame {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int roundsCount = 5;
        int maxNumber = 100;

        for (int i = 0; i < roundsCount; i++) {
            int number = (int) (Math.random() * maxNumber) + 1;
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toLowerCase();
            String correctAnswer = number % 2 == 0 ? "yes" : "no";

            if (!userAnswer.equals(correctAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n",
                        userAnswer, correctAnswer);
                System.out.printf("Let's try again, %s!\n", userName);
                scanner.close();
                return;
            }
            System.out.println("Correct!");
        }

        System.out.printf("Congratulations, %s!\n", userName);
        scanner.close();
    }
}