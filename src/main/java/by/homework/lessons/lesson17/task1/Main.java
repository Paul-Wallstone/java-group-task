package by.homework.lessons.lesson17.task1;


import java.util.List;

/**
 * @author ppuchinsky
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry", "date");
        FilterProcessor filterProcessor = new FilterProcessor();
        List<String> filtered = filterProcessor.filter(strings, s -> s.length() > 4);
        List<String> filtered2 = filterProcessor.filter2(strings, s -> s.size() > 2);
        System.out.println(filtered);
        System.out.println(filtered2);
    }


}
