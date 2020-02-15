import java.util.ArrayList;

public class Variance {
    
    public static int sum(ArrayList<Integer> list) {
        int i = list.size()-1;
        int sum = 0;
        while(i>=0) {
        sum += list.get(i);
        i--;
        }
        return sum;
    }
    
    public static double average(ArrayList<Integer> list) {
        double average = (double)sum(list)/list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double var = 0;
        double ave = average(list);
        for (int elem: list) {
            var += Math.pow((elem - ave),2);
        }
        double iance = (double)var/(list.size()-1);
        return iance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
