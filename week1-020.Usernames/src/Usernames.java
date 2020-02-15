
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String validName1 = "alex";
        String validPass1 = "mightyducks";
        String validName2 = "emily";
        String validPass2 = "cat";
        
        System.out.print("Type your username: ");
        String username = reader.nextLine();
        
        System.out.print("Type your password: ");
        String password = reader.nextLine();
        
        if(username.equals(validName1) && password.equals(validPass1) || username.equals(validName2) && password.equals(validPass2)) {
            System.out.println("You are now logged into the system!");
            
        } else {
            System.out.println("Your username or password was invalid!");
        }
        
        
                
    }
}