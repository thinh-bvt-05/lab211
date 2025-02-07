 package week_1;

import java.util.Random;

public class LinearSearch {

    private int[] array;

    public LinearSearch(int n) {
        this.array = new int[n];
    }

    void addValue() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }

    void showArray() {
        System.out.print("The array: ");

        for (int print : array) {
            System.out.print(print + " ");
        }
        System.out.println("");

    }

    int search(int number) {
        addValue();
        showArray();
        for (int i = 0; i < array.length; i++) {
         if(number == array[i])
                System.out.println("Found "+ number +" at index: "+i);
             return i;
        }
        return -1;
    }

}
