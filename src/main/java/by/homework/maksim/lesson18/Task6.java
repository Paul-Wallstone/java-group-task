package by.homework.maksim.lesson18;

import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Jaava", "Python", "C++", "Kotlin");
        String target = "Java";
        boolean result = languages.stream().anyMatch(word -> target.equals(word));

        System.out.println(result);
    }
}
