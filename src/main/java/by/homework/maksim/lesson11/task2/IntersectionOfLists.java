package by.homework.maksim.lesson11.task2;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");
        list1.add("grape");


        List<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("orange");
        list2.add("mango");

        List<String> intersection = findIntersection(list1, list2);
        System.out.println("Пересечение списков: " + intersection);
    }

    public static List<String> findIntersection(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;
    }
}
