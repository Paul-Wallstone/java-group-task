package by.homework.maksim.lesson19;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        String text = "Arsenal";
        File file = new File("D:/java2024/Text/Arsenal.txt");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            byte[] bytes = text.getBytes();
            fos.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException("File was not written!!!");
        }
    }
}
