package by.homework.maksim.lesson16.task2;

import by.homework.maksim.lesson16.task1.StringFilter;
import by.homework.maksim.lesson16.task3.Transformer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<String> strings = convert(numbers, n -> "Number: " + n);
        List<String> strings2 = convert(numbers, n -> "Integer " + n);
        System.out.println(strings);
        System.out.println(strings2);
    }

    private static List<String> convert(List<Integer> numbers, Converter<Integer, String> converter) {
        List<String> strList = new ArrayList<>();

        for (Integer i :numbers){
            String string = converter.convert(i);
            strList.add(string);
        }
        return strList;
    }


}
