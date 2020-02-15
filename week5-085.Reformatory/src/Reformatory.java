public class Reformatory {
    
    private int num=0;

    public int weight(Person person) {
        num++;
        return person.getWeight();   
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }
    
    public int totalWeightsMeasured() {
        return num;
        
        
    }

}
