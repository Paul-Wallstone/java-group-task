package by.homework.maksim.lesson14.task4;

public class Strinnng {
    public static void main(String[] args) {
        String originalString = "Hello, world!";
        int startIndex = 7;
        int endIndex = 12;

        String substring = originalString.substring(startIndex, endIndex);

        System.out.println("Исходная строка: " + originalString);
        System.out.println("Подстрока: " + substring);
    }
}
