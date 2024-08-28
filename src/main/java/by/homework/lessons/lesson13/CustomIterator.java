package by.homework.lessons.lesson13;

import java.util.Iterator;
import java.util.Random;

/**
 * @author ppuchinsky
 */
public class CustomIterator implements Iterator<Integer> {
    public static final int SIZE = 10;
    private int count;
    private int shift;
    private Integer[] arr;

    public CustomIterator() {
        this.arr = getFromDB(shift + SIZE);
    }

    @Override
    public boolean hasNext() {
        if (count >= SIZE) {
            shift += SIZE;
            arr = getFromDB(shift);
            System.out.println("get new data set with size:%s".formatted(arr.length));
            count = 0;
        }
        return arr[count] != null;
    }

    @Override
    public Integer next() {
        return arr[count++];
    }

    private Integer[] getFromDB(int shift) {
        if (shift >= 100) {
            return new Integer[SIZE];
        }
        Integer[] integers = new Integer[SIZE];
        for (int i = 0; i < SIZE; i++) {
            int num = new Random().nextInt(shift);
            integers[i] = num;
        }
        return integers;
    }
}
