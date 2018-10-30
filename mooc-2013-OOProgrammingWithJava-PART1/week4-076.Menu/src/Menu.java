
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String meal){
         if(meals.contains(meal)){
             System.out.println("This meal is already on the list.");
         } else {
             meals.add(meal);
         }
    }
    
    public void printMeals(){
        for(String m : this.meals){
            System.out.println(m);
        }
    }
    
    public void clearMenu(){
        meals.clear();
    }
}
