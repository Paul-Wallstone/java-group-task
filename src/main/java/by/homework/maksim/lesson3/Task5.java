package by.homework.maksim.lesson3;

public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] sums = sumRowsAndColumns(matrix);
        System.out.println("Сумма всех строк: " + sums[0]);
        System.out.println("Сумма всех столбцов: " + sums[1]);

        public static int sumRowsAndColumns ( int[] matrix){
            int sumRowsAndColumns = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++)
int[] sums += matrix[i];
            }
        }
    }
}