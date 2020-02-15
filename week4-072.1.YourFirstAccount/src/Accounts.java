
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
       
        Account account = new Account("Macieks", 100);
        account.deposit(20);
        System.out.println(account);
        
    }

}
