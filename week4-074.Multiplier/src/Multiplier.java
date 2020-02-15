public class Multiplier {
    
    private int number;

    public Multiplier(int number) {
        this.number = number;
    }
    
    public int multiply(int otherNumber) {
        otherNumber = number*otherNumber;
        return otherNumber;
    }
    
}
