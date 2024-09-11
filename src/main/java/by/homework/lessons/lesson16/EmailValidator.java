package by.homework.lessons.lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ppuchinsky
 */
public class EmailValidator {
    public static void main(String[] args) {
        String email = "example@domain.com";

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + " - correct email.");
        } else {
            System.out.println(email + " - not correct email.");
        }
    }
}
