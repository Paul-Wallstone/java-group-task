package by.homework.maksim.lesson18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 5, 8, 10, 15, 22);
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(evenNumbers);
    }
}
