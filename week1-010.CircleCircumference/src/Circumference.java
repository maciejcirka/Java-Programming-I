
import static java.lang.Math.PI;
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        
        double piradius = 2 * PI * radius;
        
        System.out.println("Circumference of the circle: " + piradius);
        
        
    }
}
