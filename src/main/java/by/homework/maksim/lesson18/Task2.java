package by.homework.maksim.lesson18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Task2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> upperWords = words.stream()
                .map(String::toUpperCase)
                .map(word -> {
                    String firstA = word.charAt(0) + "";
                    word = word.replaceFirst(firstA, firstA.toLowerCase());
                    return word;
                })
                .collect(Collectors.toList());

        System.out.println(upperWords);

    }
}
