
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);

        System.out.print("Type numbers: ");
        int number;
        int sum = 0;
        int counter = 0;
        double average = 0;
        int evenNum = 0;    int oddNum = 0;
        int calcEven = 0;
        
        while (true) {
            number = Integer.parseInt(reader.nextLine());
         
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is: " + sum);
                System.out.println("How many numbers: " + counter);
                
                average = (double)sum / (double)counter;
                System.out.println("Average: " + average);
                
                System.out.println("Even numbers: " + evenNum);
                System.out.println("Odd numbers: " + oddNum);
                
                break;
            }
            
            calcEven = number % 2;
            if(calcEven == 0){
                evenNum++;
            } else {
                oddNum++;
            }
           
            sum += number;
            counter++;
        }
        

    }
}
