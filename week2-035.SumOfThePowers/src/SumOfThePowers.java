
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int i = 0;

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        

        while (i <= number) {
            int result = (int) Math.pow(2, i);
            sum = sum + result;
            i++;
        }

        System.out.println("The result is " + sum);
    }
}
