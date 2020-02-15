
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String first = reader.nextLine();
        System.out.println("Type the second word: ");
        String second = reader.nextLine();
        String ans;
        int index = first.indexOf(second);
        if (index == -1) {
            ans = "is not found";

        } else {
            ans = "is found";
        }

        System.out.println("The word '" + second + "' " + ans + " in the word '" + first + "'.");
    }
}
