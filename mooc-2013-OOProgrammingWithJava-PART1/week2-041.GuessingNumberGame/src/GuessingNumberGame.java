
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guessedNumber = 0;
        int amountOfGuesses = 1;
        //int numberDrawnTest = 1;

        System.out.print("Guess a number: ");
        guessedNumber = Integer.parseInt(reader.nextLine());

        while (guessedNumber != numberDrawn) {
            if (numberDrawn < guessedNumber) {
                System.out.println("The number is lesser, guesses made: " + 
                        amountOfGuesses);
            } else {
                System.out.println("The number is greater, guesses made: " +
                        amountOfGuesses);
            } 
            System.out.print("Guess a number: ");
            guessedNumber = Integer.parseInt(reader.nextLine());
            amountOfGuesses++;
        } 
        
         if (guessedNumber == numberDrawn){
            System.out.println("Congratulations, your guess is correct!");
        }
        
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
