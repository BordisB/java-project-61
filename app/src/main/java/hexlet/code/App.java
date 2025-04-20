package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после nextInt()

        switch (choice) {
            case 1:
                Cli.greetUser();
                break;
            case 2:
                IsEvenGame.start();
                break;
            case 3:
                Calculator.start();
                break;
            case 4:
                GDC.start();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }

        scanner.close();
    }
}
