
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true) {

            System.out.println("name: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();
            Student e = new Student(name, studentNumber);
            list.add(e);

        }

        for (Student id : list) {
            System.out.println(id);
        }

        System.out.println("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");

        for (Student lf : list) {

            if (lf.getName().contains(search)) {

                System.out.println(lf);
            }

        }
    }
}
