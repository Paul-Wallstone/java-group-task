package by.homework.maksim.lesson14.task1;

public class Word {
    public static int countWords(String sentence) {
        String[] words = sentence.split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {
        String text = "Пример строки для подсчета слов";
        int wordCount = countWords(text);
        System.out.println("Количество слов: " + wordCount);
    }
}
