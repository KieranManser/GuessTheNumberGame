import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /* Guess the random number game
        Code will generate a random number
        Then user will guess within the random range
        Then code will output if the number is too high too low or correct
        Then user will win the game after correctly guessing.
        */

        //Scanner for user inputs
        Scanner scanner = new Scanner(System.in);
        //declaring the players guess as a variable
        int userGuess = 0;
        boolean stopPlaying = false;
        //do loop allows for the player to replay. keepPlaying variable is false. Once set to true it will carry on do loop.
        do {
            //Creating a Random number
            int randomNum = (int) (Math.random() * 100 + 1);
            System.out.println("I am thinking of a number!");

            //Debug tool
            //System.out.println(randomNum);

            //resetting user guess as auto-win was possible on rare chance to get same number twice
            userGuess = 0;

            //Loop to allow multiple guesses, Will loop until user inputs correct value
            while (userGuess != randomNum) {
                System.out.println("Guess the Number: ");
                //User inputs a guess
                userGuess = scanner.nextInt();
                //Reads user input creates the win condition
                if (userGuess == randomNum) {
                    System.out.println("You Win!");
                } else if (randomNum > userGuess) {
                    System.out.println("Too low! Guess higher.");
                } else {
                    System.out.println("Too high! Guess lower.");
                }
            }
            //asks if the player wants to go again. If yes or y is answered it will reset the game. If no it exits the game.
            System.out.println("Play again? (Yes/No)");
            stopPlaying = scanner.next().toUpperCase().charAt(0) == 'Y';
        } while (stopPlaying);
    }
}