
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int numberFrom = 0;
        int sum = 0;
        
        System.out.print("Until what?");
        int numberTo = Integer.parseInt(reader.nextLine());
        
        while(numberTo >= numberFrom){
            sum += numberFrom;
            numberFrom++;
        }
        
        System.out.println("Sum is " + sum);
    }
}
