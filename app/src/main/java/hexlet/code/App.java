package hexlet.code;

import hexlet.code.games.IsEvenGame;
import hexlet.code.games.Calculator;
import hexlet.code.games.GDC;
import hexlet.code.games.Progression;
import hexlet.code.games.Primegame;

import java.util.Scanner;

public class App {
    private static final int GAME_GREET = 1;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_PRIME = 6;
    private static final int GAME_EXIT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GAME_GREET + " - Greet");
        System.out.println(GAME_EVEN + " - Even");
        System.out.println(GAME_CALC + " - Calculator");
        System.out.println(GAME_GCD + " - GCD");
        System.out.println(GAME_PROGRESSION + " - Progression");
        System.out.println(GAME_PRIME + " - Prime");
        System.out.println(GAME_EXIT + " - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case GAME_GREET:
                Cli.greetUser();
                break;
            case GAME_EVEN:
                IsEvenGame.start();
                break;
            case GAME_CALC:
                Calculator.start();
                break;
            case GAME_GCD:
                GDC.start();
                break;
            case GAME_PROGRESSION:
                Progression.start();
                break;
            case GAME_PRIME:
                Primegame.start();
                break;
            case GAME_EXIT:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }

        scanner.close();
    }
}
