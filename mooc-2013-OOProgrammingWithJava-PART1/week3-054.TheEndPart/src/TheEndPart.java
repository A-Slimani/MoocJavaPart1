import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String text = reader.nextLine();
        int i = text.length();
        
        System.out.print("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());
      
        int numberFrom = i - length;
        
        System.out.print("Result: ");
        System.out.println(text.substring(numberFrom, text.length()));
       
    }
}
