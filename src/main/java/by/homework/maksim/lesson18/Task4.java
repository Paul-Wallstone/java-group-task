package by.homework.maksim.lesson18;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "elephant", "giraffe", "tiger");
        String longWord = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(longWord);
    }
}
