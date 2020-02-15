
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String nameA = reader.nextLine();
        System.out.print("Type your age: ");
        int ageA = Integer.parseInt(reader.nextLine());
        System.out.print("Type your name: ");
        String nameB = reader.nextLine();        
        System.out.print("Type your age: ");
        int ageB = Integer.parseInt(reader.nextLine());
        
        int ageC = ageA + ageB;

        System.out.print(nameA + " and " + nameB + " are " + ageC + " years old in total.");

        
    }
}
