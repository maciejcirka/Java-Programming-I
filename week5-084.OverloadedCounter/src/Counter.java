
public class Counter {

    int value;
    public boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, check);
    }
    
    public Counter() {
        this(0, false);
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void decrease() {
        this.decrease(1);
        }
    
    public void increase(int increaseAmount) {
        if(increaseAmount>=0) {
            value+=increaseAmount;
        }
        
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount>=0) {
            if (this.check == true && value-decreaseAmount>=0) {
               value-=decreaseAmount;
            } else if (this.check == true && value-decreaseAmount<=0) {
                value=0;
            
            } else if (this.check == false) {
                value-=decreaseAmount;
            }
        }
    }
}


