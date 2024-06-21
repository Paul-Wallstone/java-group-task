package by.homework.maksim.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 28, -1, 4, 10, 12};
        int[] numbers2 = {3, 5, 7, 2, 33, -5, 4, 10, 12};

        System.out.println("Максимум в массиве: " + findMax(numbers));
        System.out.println("Минимум в массиве: " + findMin(numbers2));
        System.out.println("Максимум в массивах: " + findMax(numbers2, numbers));
        System.out.println("Минимум в массивах: " + findMin(numbers2, numbers));

    }
    public static int findMin (int[] muns1, int[] muns2 ){
        int min1 = findMin(muns1);
        int min2 = findMin(muns2);
        if (min1 < min2){
            return min1;
        }
        return min2;
    }

    public static int findMax(int[] numbers1, int[] numbers2) {
        int maxInt = findMax(numbers1);
        int maxInt2 = findMax(numbers2);
        if (maxInt > maxInt2) {
            return maxInt;
        }
        return maxInt2;
    }

    public static int findMin(int[] numbers) {
        int minInt = Integer.MAX_VALUE;
        for (int num2 : numbers) {
            if (num2 < minInt) {
                minInt = num2;
            }
        }
        return minInt;
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