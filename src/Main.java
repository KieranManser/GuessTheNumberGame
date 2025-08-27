import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Guess the random number game
        Code will generate a random number
        Then user will guess within the random range
        Then code will output if the number is too high too low or correct
        Then user will win the game after correctly guessing.

        //Creating a Random number
        Random rand = new Random();
        int randNum = rand.nextInt(100) + 1;
        */

        //Scanner for user inputs
        Scanner scanner = new Scanner(System.in);
        //declaring guess as a variable
        int userGuess = 0;

        //Creating a Random number
        int randomNum = (int) (Math.random() * 100 + 1);
        System.out.println(randomNum);

        //Loop to allow multiple guesses, Will loop until user inputs correct value
        while (userGuess != randomNum) {
            System.out.println("Guess a Number: ");
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
    }
}