
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.print("First: ");
        int numberFrom = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        int numberTo = Integer.parseInt(reader.nextLine());
        
        while(numberTo >= numberFrom){
            sum += numberFrom;
            numberFrom++;
        }
        System.out.println("The sum is " + sum);
    }
}
