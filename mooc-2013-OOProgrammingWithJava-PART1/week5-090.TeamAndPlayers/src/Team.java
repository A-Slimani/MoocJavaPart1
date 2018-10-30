/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aboud
 */
import java.util.ArrayList;

public class Team {

    private String team;
    private int maxSize;
    private ArrayList<Player> playerList = new ArrayList<Player>();

    public Team(String team) {
        this.team = team;
    }

    public String getName() {
        return this.team;
    }

    public void addPlayer(Player player) {
        if(size() < this.maxSize || this.maxSize == 0){
            this.playerList.add(player);
        }
    }

    public void printPlayers() {
        String output = "";
        for (Player player : this.playerList) {
            output += player.toString() + "\n";
        }
        System.out.println(output);
    }

    public int size() {
        return this.playerList.size();
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int goals(){
        int goals = 0;
        for(Player player : playerList){
            goals += player.goals();
        }
        return goals;
    }
}
