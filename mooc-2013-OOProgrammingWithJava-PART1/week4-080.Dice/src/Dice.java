
import java.util.Random;

public class Dice {

    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        int roll = random.nextInt(this.numberOfSides + 1);
        while (roll == 0) {
            roll = random.nextInt(this.numberOfSides);
        }
        return roll;
    }

    public int getNumOfSides() {
        return this.numberOfSides;
    }
}
