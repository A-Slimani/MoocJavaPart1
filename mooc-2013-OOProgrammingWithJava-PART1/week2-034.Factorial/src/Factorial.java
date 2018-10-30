import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int numberFrom = 1;
        int factorial = 1;
        
        System.out.print("Type a number: ");
        int numberTo = Integer.parseInt(reader.nextLine());
        
        while(numberTo >= numberFrom){
            factorial *= numberFrom;
            numberFrom++;
        }
        
        System.out.println("Factorial is " + factorial);
    }
}
