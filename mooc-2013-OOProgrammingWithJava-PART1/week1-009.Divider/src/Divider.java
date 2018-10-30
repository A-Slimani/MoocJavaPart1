
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("        -----DIVISION MACHINE-----");
        
        System.out.print("Type a number: ");
        float firstNumber = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        float secondNumber = Integer.parseInt(reader.nextLine());
        
        float answer = firstNumber / secondNumber;
        System.out.println("Division: " + firstNumber + " / " + secondNumber +
                " = " + answer);
    }
}
