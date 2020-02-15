
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int count = 0;
        double average = 0.0;
        int even = 0;
        int odd = 0;

        System.out.println("Type numbers: ");

        while (number != -1) {
            
            number = Integer.parseInt(reader.nextLine());
            if (number != -1) {
                count++;
                sum += number;
                average = (double) sum / count;
                if(number%2==0) {
                    even++;
                }
                if(number%2==1) {
                    odd++;
                }
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("");
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
