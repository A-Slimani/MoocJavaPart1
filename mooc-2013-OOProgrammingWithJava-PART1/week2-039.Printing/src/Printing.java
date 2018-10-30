
public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        //System.out.println("*");
        // call this command amount times
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
            if (i == amount) {
                System.out.println();
            }
        }
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int i = 0;
        while (i < sideSize ){
          printStars(sideSize);
          i++;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
      int i = 0;
        while (i < width && i < height){
          printStars(width);
          i++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
       int s = size;
     
       while (s >= 1){
           printStars((size + 1) - s);
           s--;
       }
       
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(5);
        System.out.println("\n---");
    }

}
