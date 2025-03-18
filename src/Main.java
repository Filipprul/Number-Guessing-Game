import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("You have 5 chances to guess the correct number.");
        System.out.println();

        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");
        System.out.println();

        System.out.print("Enter your choice:");
        int choice = scanner.nextInt();
        System.out.println();

        if (choice == 1) {
            System.out.println("Great! You have selected the Easy difficulty level.");
            System.out.println("Let's start the game!");
            System.out.println();
            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter your guess:");
                int guess = scanner.nextInt();
                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + i + " attempts.");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Incorrect! The number is greater than " + guess + ".");
                    System.out.println();
                } else {
                    System.out.println("Incorrect! The number is less than " + guess + ".");
                    System.out.println();
                }
                if (10 == i) {
                    System.out.println("The correct number was " + randomNumber + ".");
                    break;
                }
            }
        }

        else if (choice == 2) {
            System.out.println("Great! You have selected the Medium difficulty level.");
            System.out.println("Let's start the game!");
            System.out.println();
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter your guess:");
                int guess = scanner.nextInt();
                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + i + " attempts.");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Incorrect! The number is greater than " + guess + ".");
                    System.out.println();
                } else {
                    System.out.println("Incorrect! The number is less than " + guess + ".");
                    System.out.println();
                }
                if (5 == i) {
                    System.out.println("The correct number was " + randomNumber + ".");
                    break;
                }
            }
        }

        else if (choice == 3) {
            System.out.println("Great! You have selected the Hard difficulty level.");
            System.out.println("Let's start the game!");
            System.out.println();
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter your guess:");
                int guess = scanner.nextInt();
                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + i + " attempts.");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Incorrect! The number is greater than " + guess + ".");
                    System.out.println();
                } else {
                    System.out.println("Incorrect! The number is less than " + guess + ".");
                    System.out.println();
                }
                if (3 == i) {
                    System.out.println("The correct number was " + randomNumber + ".");
                    break;
                }
            }
        }

        else {
            System.out.println("Select the difficulty with a number between 1 and 3");
        }
    }
}

