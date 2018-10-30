import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("            ----- GREATER NUMBER -----");
        
        System.out.print("Enter the first number: ");
        int numberOne = Integer.parseInt(reader.nextLine());
        
        System.out.print("Enter the second number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());
        
        if(numberOne > numberTwo){
            System.out.println("Greater Number: " + numberOne);
        } else if (numberTwo > numberOne){
            System.out.println("Greater Number: " + numberTwo);
        } else{
            System.out.println("The numbers are equal!");
        }
        
        
    }
}
