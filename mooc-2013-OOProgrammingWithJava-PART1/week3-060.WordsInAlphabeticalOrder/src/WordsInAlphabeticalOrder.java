
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String empty = " ";
        
        
        while(true){
            System.out.print("Type a word: ");
            String text = reader.nextLine();
            if(text.isEmpty()){
                break;
            }
            words.add(text);
           
        }
        
        System.out.println("You typed the following words: ");
        System.out.println();
        
        Collections.sort(words);
        
        for (String word : words){
            System.out.println(word);
        }
        
        
    }
}
