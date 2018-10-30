import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        
        int i = text.length();
        System.out.println(i);
        
       
        while (i >= 1){
            System.out.print(text.charAt(i - 1));
            i--;
        }
        
        
    }
}
