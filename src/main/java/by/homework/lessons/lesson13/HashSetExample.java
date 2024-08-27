package by.homework.lessons.lesson13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ppuchinsky
 */
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        Iterator<String> iterator = fruits.iterator();
        System.out.println("------------------------------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------------------------------------");
        System.out.println("Fruits: " + fruits);

        boolean hasApple = fruits.contains("Apple");
        System.out.println("Does set contain Apple? " + hasApple);

        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits);
    }
}
