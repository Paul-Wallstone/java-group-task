package by.homework.lessons.lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ppuchinsky
 */
public class HtmlTagExtractor {
    public static void main(String[] args) {
        String html = "<div>rr</div>";

        Pattern pattern = Pattern.compile("<div>(.*)</div>");
        Matcher matcher = pattern.matcher(html);

        if (matcher.find()) {
            System.out.println("text div: " + matcher.group(1));
        } else {
            System.out.println("Тег <div> not found.");
        }
    }
}
