package by.homework.maksim.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        arrayRevers(numbers);
    }
    public static void arrayRevers(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Перевернутый массив: " + numbers[i]);
        }
    }
}