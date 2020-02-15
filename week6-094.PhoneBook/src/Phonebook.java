
import java.util.ArrayList;


public class Phonebook {

    private ArrayList<Person> personList = new ArrayList<Person>();


    public void add(String name, String number) {
        Person newPerson = new Person(name, number);
        personList.add(newPerson);
    }

    public void printAll() {
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {

        String number = "";

        for (Person person : personList) {
            if (person.getName().equals(name)) {
                number+= person.getNumber();
                return number;
            }
        }
        return "number not known";
    }
}
