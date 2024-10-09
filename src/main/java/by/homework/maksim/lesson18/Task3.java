package by.homework.maksim.lesson18;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 11, 7, 14);
        Integer max = numbers.stream()
                .max(Integer::compareTo)
                .orElseGet(() -> null);
        System.out.println(max);
    }
}
