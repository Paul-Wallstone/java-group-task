package by.homework.maksim.lesson3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 3, 12, 5, 6};
        int[] reversed = reverseArray2(numbers);
        System.out.println("Перевернутый массив: " + Arrays.toString(reversed));
    }

    public static int[] reverseArray2(int[] nums) {
        int start = 0;
        int temp;
        for (int end = nums.length - 1; end >= (nums.length / 2); end--) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;

        }

        return nums;
    }


    public static int[] reverseArray(int[] nums) {
        int[] reversedNumbers = new int[nums.length];
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            reversedNumbers[count] = nums[i];
            count++;
        }
        return reversedNumbers;
    }
}


