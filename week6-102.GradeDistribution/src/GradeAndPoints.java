
import java.util.ArrayList;

public class GradeAndPoints {

    ArrayList<Integer> grades;

    public GradeAndPoints() {
        this.grades = new ArrayList<Integer>();

    }

    public void add(int points) {

        if (points < 30) {
            grades.add(0);

        } else if (points < 35) {
            grades.add(1);

        } else if (points < 40) {
            grades.add(2);

        } else if (points < 45) {
            grades.add(3);

        } else if (points < 50) {
            grades.add(4);

        } else if (points <= 60) {
            grades.add(5);

        }

    }

    public void printAll() {

        
        System.out.println("Grade distribution: ");
        
        for (int i = 5; i >= 0; i--) {
            this.printStars(i);
        }

        System.out.print("Acceptance percentage: ");
        System.out.println(this.acceptance());
    }

    public void printStars(int number) {
        
        System.out.print(number + ": ");
        for (int grade : grades) {

            if (grade == number) {
                System.out.print("*");
            }

        }
        System.out.println("");

    }

    public double acceptance() {
        double i = 0;
        for (int grade : grades) {
            if (grade > 0) {
                i++;
            }
        }

        return 100 * (i / grades.size());

    }
    
    
}
