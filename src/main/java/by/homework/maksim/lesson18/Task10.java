package by.homework.maksim.lesson18;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("John", 24), new Person("Alice", 30), new Person("Bob", 25));

        Map<Integer, List<Person>> peopleAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println(peopleAge);

        Map<String, List<Person>> peopleNameMap = people.stream()
                .collect(Collectors.groupingBy(Person::getName));

        System.out.println(peopleNameMap);
    }
}
