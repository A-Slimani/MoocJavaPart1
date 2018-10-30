public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter firstCon = new Counter(15, false);
        firstCon.increase();
        firstCon.decrease(-20);
        
        System.out.println("first counter test: " + firstCon.value());
    }
}
