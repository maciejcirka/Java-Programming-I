
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int rep = 1;

        while (true) {
            System.out.print("Guess a number: ");
            int guessed = Integer.parseInt(reader.nextLine());
            rep++;

            if (guessed > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + rep);
            } else if (guessed < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + rep);
            } else if (guessed == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
