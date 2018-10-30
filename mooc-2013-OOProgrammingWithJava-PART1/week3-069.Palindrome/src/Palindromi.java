    import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String textReversed = "";
        int i = text.length();
        
        while (i >= 1){
            textReversed += text.charAt(i-1);
            i--;
        }
        System.out.println(textReversed);
        
        if(text.contentEquals(textReversed)){
            return true;
        } else {
            return false;
        }   
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
        
    }
}
