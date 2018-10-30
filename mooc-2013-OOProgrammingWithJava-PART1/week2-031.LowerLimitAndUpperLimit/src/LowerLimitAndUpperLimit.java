
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int numberFrom = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        int numberTo = Integer.parseInt(reader.nextLine());
        
        while(numberTo >= numberFrom){
            System.out.println(numberFrom);
            numberFrom++;
        }
    }
}
