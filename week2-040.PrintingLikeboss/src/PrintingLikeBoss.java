
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        int w = size - 1;

        while (i < size) {
            int s = size - w;
            printWhitespaces(w);
            w--;
            printStars(s);
            i++;
        }
    }

    public static void xmasTree(int height) {
        int i = 0;
        int i2 = 0;
        int w = height - 1;
        int s = 1;
        while (i < height) {

            printWhitespaces(w);
            printStars(s);
            s += 2;
            w--;
            i++;
        }
        while (i2 < 2) {
            printWhitespaces(height - 2);
            printStars(3);
            i2++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("\n---");
        xmasTree(4);
        System.out.println("\n---");
        xmasTree(10);
    }
}
