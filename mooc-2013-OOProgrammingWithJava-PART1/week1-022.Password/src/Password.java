
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        System.out.println("                    ----- PASSWORD -----");
        
       while(true){
            System.out.print("Type the password: ");
            String text = reader.nextLine();
            if(text.equals("carrot")){
                System.out.println("Right!"
                        + "\nThe secret is: erny pbqvat ubhef jubf hc");
                break;
            }
            else{
                System.out.println("Wrong!");
            }
            
   }
}
}
