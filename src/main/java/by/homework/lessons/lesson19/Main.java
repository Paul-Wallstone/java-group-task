package by.homework.lessons.lesson19;

import java.io.*;

/**
 * @author ppuchinsky
 */
public class Main {
    public static void main(String[] args) {

        String text = "Hello! It's test of OutputStream...!!!!:)";
        File file = new File("src/main/java/by/homework/resource/example-output2.trp");
        String absolutePath = file.getAbsolutePath();
        String name = file.getName();
        long length = file.length();
        System.out.println(absolutePath);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            byte[] bytes = text.getBytes();
            fos.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException("File was not written!!!");
        }


        String output = null;
        if (file.exists()) {
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] bytes = new byte[(int) file.length()];
                int readLength = fis.read(bytes);
                if (readLength != file.length()) {
                    throw new RuntimeException("File was not full read!!!");
                }
                output = new String(bytes);
            } catch (IOException e) {
                throw new RuntimeException("File was not read!!!");
            }
        }
        System.out.println(output);

        String filePath = "src/main/java/by/homework/resource/example.txt";

        // Writing to a file using FileWriter
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("-------------------------------------------------------------\n");
            writer.write("This is an example of writing to a file.\n");
            writer.write("FileWriter is used to write character streams to a file.\n");
            writer.write("-------------------------------------------------------------\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file using FileReader
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // Prints each character read
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fileReader = new File(filePath);

        String result = null;
        try (FileReader reader = new FileReader(filePath)) {
            char[] chars = new char[(int) fileReader.length()];
            int readLength = reader.read(chars);
            if (readLength != fileReader.length()) {
                throw new RuntimeException("File was not full read!!!");
            }
            result = new String(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
