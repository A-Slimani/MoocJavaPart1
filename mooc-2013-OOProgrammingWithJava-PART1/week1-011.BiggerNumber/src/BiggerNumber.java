
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("           ------ BIGGER NUMBER ------");
        
        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());
        
        int biggerNumber = Math.max(numberOne, numberTwo);
        System.out.println("The bigger number of the two numbers given was: " + biggerNumber);
    }
}
