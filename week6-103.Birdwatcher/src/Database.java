
import java.util.ArrayList;
import java.util.Collections;

public class Database {

    private ArrayList<Bird> birds;

    public Database() {
        this.birds = new ArrayList<Bird>();

    }

    public void add(String name, String latinName) {

        birds.add(new Bird(name, latinName));
        Collections.reverse(birds);

    }

    public void observation(String name) {

        for (Bird bird : birds) {
            if (name.equals(bird.getName())) {
                bird.seen();
                return;
            }
        }

        System.out.println("Is not a bird!");
    }

    public void show(String name) {

        for (Bird bird : birds) {
            if (name.equals(bird.getName())) {

                System.out.print(bird.getName() + " (" + bird.getLatinName() + "): ");
                System.out.println(bird.getSeen() + " observations");
                return;

            }

        }
        System.out.println("Is not a bird!");
    }

    public void statistics() {
        for (Bird bird : birds) {
            show(bird.getName());
        }

    }

}
