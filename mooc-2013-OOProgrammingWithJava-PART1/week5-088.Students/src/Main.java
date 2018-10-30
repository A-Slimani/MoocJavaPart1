
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<Student>();
        
        while (true) {
            System.out.println("name: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("student number:");
            String studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
        }
        for(Student name : list){
            System.out.println(name.toString());
        }
        
        System.out.println("Give search term: ");
        String letters = reader.nextLine();
        
        System.out.println("Result: ");
        
        for(Student name : list){
            boolean check = name.searchTwo(letters);
            if(check == true){
                System.out.println(name.toString());
            }
        }
    }
}
