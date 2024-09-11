package by.homework.lessons.lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ppuchinsky
 */
public class Cvantificators {
    public static void main(String[] args) {
        //Greedy
        Pattern pattern = Pattern.compile("a.+a");
        Matcher matcher = pattern.matcher("aabaaah");
        boolean matches = "aabaaa".matches("a.+a");
        System.out.println(matches);
        if (matcher.find()) {
            System.out.println("Greedy found: " + matcher.group());
        }
        //Lazy
        Pattern patternLazy = Pattern.compile("a.+?a");
        Matcher matcherLazy = patternLazy.matcher("aabaaad");
        if (matcherLazy.find()) {
            System.out.println("Lazy found: " + matcherLazy.group());
        }
        //Possessive
        Pattern patternPossessive = Pattern.compile("a[a-z]++a");
        Matcher matcherPossessive = patternPossessive.matcher("aabaaah6");
        if (matcherPossessive.find()) {
            System.out.println("Possessive found: " + matcherPossessive.group());
        } else {
            System.out.println("Possessive not found");
        }

        Pattern patternPossessive2 = Pattern.compile("a.+");
        Matcher matcherPossessive2 = patternPossessive2.matcher("daabaaah");
        if (matcherPossessive2.find()) {
            System.out.println("Possessive2 found: " + matcherPossessive2.group());
        }
    }
}
