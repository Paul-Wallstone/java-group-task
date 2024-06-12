package by.homework.maksim.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 28, -1, 4, 10, 12};
        System.out.println("Максимум в массиве: " + findMax(numbers));
    }

    public static int findMax(int[] numbers) {
        int maxInt = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > maxInt) {
                maxInt = num;
            }
        }
        return maxInt;
    }
}