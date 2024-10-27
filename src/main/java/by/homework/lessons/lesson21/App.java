package by.homework.lessons.lesson21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author ppuchinsky
 */
public class App {

    public static final String EXIT = "4";

    public static void main(String[] args) {
        boolean exit = false;
        String name = "";
        while (!exit) {
            System.out.println("Enter name:");
            Scanner scanner = new Scanner(System.in);
            name = scanner.next();
            System.out.println("Enter text:");
            String next = scanner.next();
            if (EXIT.equals(next)) {
                exit = true;
            }
            System.out.println("%s - %s: "
                    .formatted(name, LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm")))
                    + next);
        }

        System.out.println("Exit");
    }
}
