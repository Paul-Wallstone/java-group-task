package by.homework.maksim.lesson18;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 11, 7, 14);
        int max = numbers.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(max);
    }
}
