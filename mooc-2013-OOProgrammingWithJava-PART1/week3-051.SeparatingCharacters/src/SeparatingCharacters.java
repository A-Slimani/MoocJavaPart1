
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String text = reader.nextLine();

        int i = text.length();
        int j = 1;

        while (i > 0) {
            System.out.println(j + ". character: " + text.charAt(j - 1));
            j++;
            i--;
        }
    }
}
