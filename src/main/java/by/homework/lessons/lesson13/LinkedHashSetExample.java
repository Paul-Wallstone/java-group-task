package by.homework.lessons.lesson13;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author ppuchinsky
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");

        cities.add("New York");

        System.out.println("Cities: " + cities);

        System.out.println("Number of cities: " + cities.size());
    }
}
