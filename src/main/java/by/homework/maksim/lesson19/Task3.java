package by.homework.maksim.lesson19;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("D:/java2024/Text/Text.txt");
        try (FileReader reader = new FileReader(file)) {
            int city;
            while ((city = reader.read()) != -1) {
                System.out.print((char) city);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
