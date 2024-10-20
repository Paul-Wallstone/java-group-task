package by.homework.maksim.lesson19;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        File file = new File("D:/java2024/Text/Clon.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Clon \n");
            writer.write("DIesel!\n");

            System.out.println(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

