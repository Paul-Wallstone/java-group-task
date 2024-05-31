package by.homework.maksim.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int findMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > findMax) {
                findMax = numbers[i];
            }
            System.out.println("Максимум в массиве: " + findMax);
        }
    }
}
