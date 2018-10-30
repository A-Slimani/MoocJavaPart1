
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // test your code here
        Team barcelona = new Team("FC Barcelona");
        //barcelona.setMaxSize(4);
        
        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
        barcelona.addPlayer(new Player("hamza" , 8));
        
        Team j = new Team("RAGE");
        Player p = new Player("Jakko");
        j.addPlayer(p);
        j.printPlayers();
        
        barcelona.printPlayers();
        System.out.println("Number of players: " + barcelona.size());
        System.out.println("Total goals: " + barcelona.goals());
        
        
    } 
}
