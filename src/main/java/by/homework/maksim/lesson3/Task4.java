package by.homework.maksim.lesson3;


public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 3, 5};
        int target = 3;
        System.out.println("Индекс числа " + target + ": " + findIndex(numbers, target));
    }

    public static int findIndex(int[] nums, int target) {
        int index = -1;
        for (int i = 0, i <nums.length, i++){
            if (nums[i] == target) {
                index = i;
                return nums[i];
            }
            return -1;
        }

    }
}