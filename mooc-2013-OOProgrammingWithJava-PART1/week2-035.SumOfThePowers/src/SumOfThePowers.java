
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int power = 0;
        int sum = 0;
        int two = 2;
       
        System.out.print("Type a number: ");
        int numberTo = Integer.parseInt(reader.nextLine());
        
        while (numberTo >= power){
            sum += (int)Math.pow(2, power);
            power++;
        }
        System.out.println("The result is " + sum);
    }
}
