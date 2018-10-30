
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        int test = word.indexOf(letter);
        if (test < 0) {
            this.numberOfFaults++;
            if(guessedLetters.contains(letter)){
                this.numberOfFaults--;
            }
            test = 1;
        }
        if (!this.guessedLetters.contains(letter)) {
            this.guessedLetters += letter;
        }

        // if the letter has already been guessed, nothing happens
        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String hiddenWord = "";
        String currentHiddenWord = "";
        for(int length = 0; length < this.word.length(); length++){
           hiddenWord += "_";  
        }
        
        for (int i = 0; i < this.word.length(); i++) {
            char currentLetter = this.word.charAt(i);
            char guessedCurrentLetter ='a';
            
                for (int j = 0; j < this.guessedLetters.length(); j++) {
                    guessedCurrentLetter = this.guessedLetters.charAt(j);
                    //System.out.println(guessedCurrentLetter + " " + currentLetter); // for help
                    
                    if (guessedCurrentLetter == currentLetter) {
                        currentHiddenWord += currentLetter;
                        break;
                    } else if(j + 1 == this.guessedLetters.length()) {
                        currentHiddenWord += "_";
                    }
                    hiddenWord = currentHiddenWord;
                }
           
        }
        

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 
        // return the hidden word at the end
        return hiddenWord;
    }
}
