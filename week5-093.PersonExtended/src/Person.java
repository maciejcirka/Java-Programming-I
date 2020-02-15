
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;
    
    int d = Calendar.getInstance().get(Calendar.DATE);
        int m = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int y = Calendar.getInstance().get(Calendar.YEAR);

        MyDate today = new MyDate(d, m, y);

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name) {

        this.name = name;
        this.birthday = today;
    }

    public int age() {

        int age = today.differenceInYears(this.birthday);

        return age;
    }

    public boolean olderThan(Person compared) {

        return birthday.earlier(compared.birthday);

    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
