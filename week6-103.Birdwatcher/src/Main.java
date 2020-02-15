
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        start(scanner);

    }

    public static void start(Scanner scanner) {
        Database database = new Database();
        String command;

        while (true) {
            System.out.print("? ");
            command = scanner.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String latinName = scanner.nextLine();
                database.add(name, latinName);
            } else if (command.equals("Observation")) {
                System.out.print("What was observed:? ");
                String seen = scanner.nextLine();
                database.observation(seen);
            } else if (command.equals("Statistics")) {
                database.statistics();
            } else if (command.equals("Show")) {
                System.out.print("What? ");
                String what = scanner.nextLine();
                database.show(what);
            } else if (command.equals("Quit")) {
                break;
            }

        }

    }

}
