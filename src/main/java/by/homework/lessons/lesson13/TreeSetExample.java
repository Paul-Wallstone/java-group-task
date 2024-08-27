package by.homework.lessons.lesson13;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author ppuchinsky
 */
public class TreeSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(77);
        numbers.add(9);
        numbers.add(20);
        numbers.add(1);

        for(Integer i: numbers){

        }

        SortedSet<Integer> integers = numbers.subSet(1,true, 10,true);
        System.out.println("Numbers in sorted order: " + numbers);

        Integer integer = ((TreeSet<Integer>) numbers).pollFirst();
        System.out.println("After removing the smallest element: " + numbers);

        ((TreeSet<Integer>) numbers).pollLast();
        System.out.println("After removing the largest element: " + numbers);
    }
}
