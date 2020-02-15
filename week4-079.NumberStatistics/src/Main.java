
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();

        System.out.println("Type numbers: ");
        int num = reader.nextInt();

        while (!(num == -1)) {

            if (num % 2 == 0) {
                statsEven.addNumber(num);
                stats.addNumber(num);
            } else if (num % 2 == 1) {
                statsOdd.addNumber(num);
                stats.addNumber(num);
            }

            num = reader.nextInt();

        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + statsEven.sum());
        System.out.println("sum of odd:  " + statsOdd.sum());
    }
}
