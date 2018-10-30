public class Reformatory {
    private int counter;
    
    public int weight(Person person) {
        // return the weight of the persons
        counter++;
        return person.getWeight();
    }
    
    public int totalWeightsMeasured(){
        //counts the amount of times weight being measured
        return counter;
    }
    
    public void feed (Person person){
      // adds 1 to persons weight.
      person.setWeight(person.getWeight() + 1);
    }

}
