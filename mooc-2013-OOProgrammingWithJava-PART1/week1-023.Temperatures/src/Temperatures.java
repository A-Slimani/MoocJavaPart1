
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        while(true){
        System.out.print("Type the temperature for the neext 5 days. ");
        double number = Double.parseDouble(reader.nextLine());
        double number2 = Double.parseDouble(reader.nextLine());
        double number3 = Double.parseDouble(reader.nextLine());
        double number4 = Double.parseDouble(reader.nextLine());
        double number5 = Double.parseDouble(reader.nextLine());
        if (number <= 40 || number >= -30) {
         System.out.println("The number has to be bigger than -30 and lower than 40.");
        } else {
           Graph.addNumber(number);
        }
        
        if (number2 <= 40 || number2 >= -30) {
         System.out.println("The number has to be bigger than -30 and lower than 40.");
        } else {
           Graph.addNumber(number2);
        }
        
        if (number3 <= 40 || number3 >= -30) {
         System.out.println("The number has to be bigger than -30 and lower than 40.");
        } else {
           Graph.addNumber(number3);
        }
        
        if (number4 <= 40 || number4 >= -30) {
         System.out.println("The number has to be bigger than -30 and lower than 40.");
        } else {
           Graph.addNumber(number4);
        }
        
        if (number5 <= 40 || number5 >= -30) {
         System.out.println("The number has to be bigger than -30 and lower than 40.");
        } else {
           Graph.addNumber(number5);
        }
        
        break;
        /* Graph is used as follows:
        Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);
        Remove or comment out these lines above before trying to run the tests.
        */
        }
    }
}

   