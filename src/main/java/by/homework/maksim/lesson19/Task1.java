package by.homework.maksim.lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.awt.SystemColor.text;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("D:/java2024/Text/Text.txt");
        try (FileInputStream fis = new FileInputStream(file)) { //создали

            int bite;
            while ((bite = fis.read()) != -1) {
                System.out.println((char) bite);
            }

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
