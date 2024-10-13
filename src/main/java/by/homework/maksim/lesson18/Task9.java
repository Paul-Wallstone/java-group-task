package by.homework.maksim.lesson18;

import java.util.Arrays;
import java.util.List;


public class Task9 {
    public static void main(String[] args) {
        List<Person> peoples = Arrays.asList(new Person("John", 25), new Person("Alice", 30), new Person("Bob", 22));

        List<String> names = peoples.stream()
                .map(pe -> pe.getName())
                .toList();

        System.out.println(names);
    }
}
