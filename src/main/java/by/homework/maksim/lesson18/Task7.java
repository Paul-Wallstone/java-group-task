package by.homework.maksim.lesson18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);
        List<Integer> nextNumber = numbers.stream()
                .skip(3)
                .toList();
        System.out.println(nextNumber);
    }
}
