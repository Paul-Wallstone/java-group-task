package by.homework.maksim.lesson3;

public class Task2 {

    public static void main(String[] args) {
        int[] numbers = {10, 2, 3, 4, 5};
        int sumOfArray = 0;
        for (int i = 0; i < numbers.length; i++)
            sumOfArray += numbers[i];
        System.out.println("Сумма элементов массива: " + sumOfArray);
    }
}