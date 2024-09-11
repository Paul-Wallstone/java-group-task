package by.homework.lessons.lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ppuchinsky
 */
public class ReplaceSpaces {
    public static void main(String[] args) {
        String text = "replace all spaces in the string";

        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(text);

        String replacedText = matcher.replaceAll("_");

        System.out.println("Result: " + replacedText);
    }
}
