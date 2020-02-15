
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        
        
        System.out.print("Until what? ");
        int max = Integer.parseInt(reader.nextLine());
        
        while (i <=max) {
           sum= sum+i;
            i++;
            }
        System.out.println("Sum is " + sum);
    }
}
