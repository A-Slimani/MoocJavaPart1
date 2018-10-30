
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;

        while (i < amount) {
            System.out.print("*");
            i++;
            if (i == amount) {
                System.out.println();
            }
        }
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;

        while (i < amount) {
            System.out.print(" ");
            i++;
        }

    }

    public static void printTriangle(int size) {

        int i = 0;

        while (i < size) {

            printWhitespaces(size - (i + 1));
            i++;
            printStars(i);

        }

    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 0;
        int j = 0;

        while (i < height) {

            printWhitespaces(height - (i + 1));
            i++;
            j = i;
            printStars(i + (j - 1));
        }
        int h = 2;
        int w = 3;

        while (h > 0) {
            printWhitespaces(height - 2);
            printStars(w);
            h--;
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(3);
        System.out.println("---");
        xmasTree(5);
        System.out.println("---");
        xmasTree(9);

    }
}
