
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int numberFrom = 1;
        
        System.out.print("Up to what number? ");
        int numberTo = Integer.parseInt(reader.nextLine());
        
        
        while(numberTo >= numberFrom){
            System.out.println(numberFrom);
            numberFrom++;
        }
        
    }
}
