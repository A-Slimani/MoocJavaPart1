import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    
    
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String empty = " ";
        //int arrayAmount = 1;
        
        while(true){
            System.out.print("Type a word: ");
            String text = reader.nextLine();
            if(text.isEmpty()){
                break;
            }
            words.add(text);
            //arrayAmount++;
        }
        
        System.out.println("You typed the following words: ");
        System.out.println();
        /*
        Collections.reverse(words);
       
        for(String word : words){
            System.out.println(words);
        }  
        */
        for(int i = words.size() - 1; i >= 0; i--){
            System.out.println(words.get(i));
        }
    }
}
