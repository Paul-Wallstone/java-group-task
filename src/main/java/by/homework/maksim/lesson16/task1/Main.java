package by.homework.maksim.lesson16.task1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> strings = List.of("apple", "banana", "cherry", "date");
        List<String> filtered = filter(strings, s -> s.length() > 5);
        List<String> filtered2 = filter(strings, s -> s.charAt(0) == 'b');
        List<String> filtered3 = filter(strings, s -> s.equals("date"));
        System.out.println(filtered);
        System.out.println(filtered2);
        System.out.println(filtered3);

    }

    private static List<String> filter(List<String> strings, StringFilter<String> stringFilter) {
        List<String> strList = new ArrayList<>();
        for (String s : strings) {
            if (stringFilter.apply(s)) {
                strList.add(s);
            }
        }
        return strList;

    }
}