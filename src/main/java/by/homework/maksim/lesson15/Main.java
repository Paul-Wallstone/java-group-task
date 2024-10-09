package by.homework.maksim.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Paris");
        strings.add("LoNdOn");
        strings.add("wORLd");
        strings.add("Made in Minsk");

        StringBuilder result = new StringBuilder();


        for (String str : strings) {
            result.append(str);
        }
        System.out.println(result);

        result = new StringBuilder(result.toString().replaceAll("\\s+", ""));
        System.out.println(result);

        result.reverse();
        System.out.println(result);

        for (int i = 3; i < result.length(); i += 4) {
            result.insert(i, '*');
        }
        System.out.println(result);

    }
}
