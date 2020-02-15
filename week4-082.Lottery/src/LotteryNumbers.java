
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        this.drawNumbers();

    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        int i = 0;
        int numberDrawn;
        this.numbers = new ArrayList<Integer>();

        while (i < 7) {
            numberDrawn = random.nextInt(39)+1;
            if (!containsNumber(numberDrawn)) {
                numbers.add(numberDrawn);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
