
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
   
    
    public NumberStatistics (){
        sum = 0;
        amountOfNumbers = 0;
        
    }
    
    public void addNumber(int number){
        amountOfNumbers++;
        sum += number;
    }
    
    public int amountOfNumbers(){
      return amountOfNumbers;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        double average = (double) sum / amountOfNumbers;
        if (sum == 0 || amountOfNumbers == 0){
            return average = 0;
        }
        return average;
    }
    
    
}
