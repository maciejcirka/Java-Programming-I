
import java.util.Random;

public class PasswordRandomizer {

    Random random;
    int length;
    

    public PasswordRandomizer(int length) {
        this.length = length;
        random = new Random();

    }

    public String createPassword() {

        int i = 0;
        int number;
        String password = "";

        while (i <= length-1) {

            number = this.random.nextInt(26);
            password+= "abcdefghijklmnopqrstuvwxyz".charAt(number);
            i++;
        }

        return "" + password;
    }
}
