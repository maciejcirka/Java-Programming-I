
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        gatherAndPrint(scanner);

    }

    public static void gatherAndPrint(Scanner scanner) {

        GradeAndPoints gap = new GradeAndPoints();

        System.out.println("Type exam scores, -1 completes: ");

        while (true) {
            int points = Integer.parseInt(scanner.nextLine());

            if (points == -1) {
                break;
            }

            if (points >= 0 && points <= 60) {
                gap.add(points);
            }

        }

        gap.printAll();

    }

}
