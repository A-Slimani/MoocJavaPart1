import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        
        int i = text.length();
        int j = 1;
        
        while(i >= 3 && j < 4){
             System.out.println(j + ". character: " + text.charAt(j - 1));
             j++;
        }
        
    }
}
