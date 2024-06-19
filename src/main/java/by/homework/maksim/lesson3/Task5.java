package by.homework.maksim.lesson3;

public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] sums = sumRows(matrix);
        System.out.println("Сумма всех строк: " + sums[0]);
    }

    public static int[] sumRows(int[][] numbers) {
        int[] sums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
            sums[i] = sum;
        }
        return sums;
    }
}
