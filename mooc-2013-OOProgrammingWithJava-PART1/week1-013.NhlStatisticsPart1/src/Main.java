
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        //print top ten players based on goals
        System.out.println("Top ten by goals: ");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        //print top 25 players based on penatly amount
        System.out.println("Top 25 by penatly amount: ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        //print stats for Sidney Crosby
        System.out.println("Stats for Sidney Crosby: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        //print stats for Philadelphia Flyers
        System.out.println("Stats for Philadelphia Flyers: ");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
        //print Players in Anaheim Ducks
        System.out.println("Stats for Anaheim Ducks ordered by points: ");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        
        //print top ten players based on points
        System.out.println("Top ten by points: ");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);
      
    }
}
