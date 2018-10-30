
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.println("        -----CIRCUMFERENCE CALCULATOR-----");
        
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        
        float circumference = (float) (2 * Math.PI * radius);
        
        System.out.println("Circumference of the circle: " + circumference);
        
    }
}
