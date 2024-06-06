package by.homework.lessons.lesson04;

/**
 * @author ppuchinsky
 */
public class Lesson4 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        System.out.println("Максимум в массиве: " + findMax(numbers));
    }

    private static int findMax(int[] numbers) {
        int maxInt = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > maxInt) {
                maxInt = num;
            }
        }
        return maxInt;
    }
}
