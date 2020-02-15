
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {

        int small = array[0];
        for (int number : array) {
            if (number < small) {
                small = number;
            }

        }
        return small;

    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = smallest(array);
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {

        for (int i = index; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }

        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {

        int value1 = array[index1];

        array[index1] = array[index2];
        array[index2] = value1;

    }

    public static void sort(int[] array) {
        int index;
       

        for (int i = 0; i < array.length; i++) {

            index = indexOfTheSmallestStartingFrom(array, i);
            swap(array, index, i);
            System.out.println(Arrays.toString(array));

        }

    }

}
