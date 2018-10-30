
public class TestProgram {

    public static void main(String[] args) {

        HangmanLogic l = new HangmanLogic("park");
        System.out.println("Word at start: " + l.hiddenWord());

        //System.out.println("Let us guess: A, D, S, F, D");
        l.guessLetter("A");
        l.guessLetter("A");
        l.guessLetter("A");
        l.guessLetter("S");
        l.guessLetter("F");
        l.guessLetter("D");
        l.guessLetter("X");
        l.guessLetter("Y");
        System.out.println("Guessed letters: " + l.guessedLetters());
        System.out.println("Number of faults: " + l.numberOfFaults());
        System.out.println("Word is: " + l.hiddenWord());

    }
}
