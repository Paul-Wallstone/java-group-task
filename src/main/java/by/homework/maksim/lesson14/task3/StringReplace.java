package by.homework.maksim.lesson14.task3;

public class StringReplace {
    public static void main(String[] args) {
        String originalString = "Hello, world!";
        char oldChar = 'l';
        char newChar = 'x';

        String newString = originalString.replace(oldChar, newChar);

        System.out.println("Исходная строка: " + originalString);
        System.out.println("Новая строка: " + newString);
    }
}
