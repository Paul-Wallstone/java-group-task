package by.homework.lessons.lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ppuchinsky
 */
public class OnlyLetters {
    public static void main(String[] args) {
        String input = "    ExampleOfString";

        Pattern pattern = Pattern.compile("^\\s{3}[a-zA-Z]+$");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println(input + " contains only letters.");
        } else {
            System.out.println(input + " contains not only letters.");
        }
    }
}
