package by.homework.maksim.lesson3;

public class Task2 {

    public static void main(String[] args) {
        int[] numbers = {10, 12, 3, 4, 5};
        System.out.println("Сумма элементов массива: " + sumOfArray(numbers));
    }

    public static int sumOfArray(int[] numbers) {
        int sumArray = 0;
        for (int num : numbers) {
            sumArray += num;
        }
        return sumArray;
    }

}