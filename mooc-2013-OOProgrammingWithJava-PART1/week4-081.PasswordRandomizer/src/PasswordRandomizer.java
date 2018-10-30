
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private Random random = new Random();

    private int passwordLength;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLength = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String createPassword = "";

        for (int i = 0; i < this.passwordLength; i++) {
            int number = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            
            createPassword += symbol;
        }

        return createPassword;
    }
}
