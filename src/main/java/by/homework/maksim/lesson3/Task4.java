package by.homework.maksim.lesson3;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 32, 3};
        int target = 3;
        System.out.println("Индекс числа " + target + ": " + findIndex(numbers, target));
    }

    public static int findIndex(int[] numbers, int target) {
        for (int i = 0; i <numbers.length; i++){
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
}