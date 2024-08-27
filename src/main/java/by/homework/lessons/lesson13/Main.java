package by.homework.lessons.lesson13;

import java.util.Iterator;

/**
 * @author ppuchinsky
 */
public class Main {
    public static void main(String[] args) {
        CustomIterator customIterator = new CustomIterator();
        extracted(customIterator);
    }

    private static void extracted(Iterator<Integer> customIterator) {
        System.out.println("Start");
        while (customIterator.hasNext()) {
            System.out.println(customIterator.next());
        }
        System.out.println("Finish");
    }
}
