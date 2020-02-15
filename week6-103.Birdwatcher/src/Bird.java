
public class Bird {

    private String name;
    private String latinName;
    private int seen;

    public Bird(String name, String latinName) {

        this.name = name;
        this.latinName = latinName;
        this.seen = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public void seen() {
        this.seen++;
    }
    
    public int getSeen() {
        return this.seen;
    }

}
