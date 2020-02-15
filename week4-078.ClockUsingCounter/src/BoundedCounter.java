public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        if(this.value >= this.upperLimit) {
           this.value = 0;
        } else {
            value++;
        }
        
    }

    public String toString() {
        if(value<10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
    
    public int getValue() {
       
        return this.value;
}
    
    public void setValue(int newValue) {
        if (newValue>0 && newValue<=upperLimit) {
            this.value = newValue;
        }
    }
    
}
