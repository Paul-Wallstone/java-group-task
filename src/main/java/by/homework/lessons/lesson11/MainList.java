package by.homework.lessons.lesson11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ppuchinsky
 */
public class MainList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("11");
        list.add("12");

        for (String i : list) {
            System.out.println(i);
        }
        System.out.println("----------------------------------------------");
        String result = list.get(1);
        System.out.println("Result: " + result);
        System.out.println("----------------------------------------------");

        list.remove("12");
        list.forEach(i -> System.out.println(i));
        System.out.println("----------------------------------------------");
        System.out.println("List is empty: %s".formatted(list.isEmpty()));
        System.out.println("Size: %s".formatted(list.size()));
        System.out.println("Contain: %s".formatted(list.contains("15")));
        System.out.println("----------------------------------------------");

        List<String> list2 = new ArrayList<>();
        list2.add("16");
        list2.add("15");
        list2.add("14");
        list.addAll(list2);

        System.out.println("Contain2: %s".formatted(list.contains("15")));
        System.out.println("----------------------------------------------");
        System.out.println("Before sort");
        list.forEach(i -> System.out.println(i));
        list.sort((a, b) -> Integer.parseInt(a) - Integer.parseInt(b));
        System.out.println("Sorted:");
        list.forEach(i -> System.out.println(i));
        list.clear();
        System.out.println("Size clear: %s".formatted(list.size()));
        System.out.println("----------------------------------------------");
    }
}
