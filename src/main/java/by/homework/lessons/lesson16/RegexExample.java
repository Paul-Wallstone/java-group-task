package by.homework.lessons.lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ppuchinsky
 */
public class RegexExample {
    public static void main(String[] args) {
        String text = "In text we have some numbers: 123, 456 и 789088.";

        Pattern pattern = Pattern.compile("\\d{3}");


        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {
            System.out.println("found numbers: " + matcher.group());
        }
    }
}
