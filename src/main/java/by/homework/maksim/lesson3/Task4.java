package by.homework.maksim.lesson3;

public class Task4 {
    public class FindIndex {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            int target = 3;

            int index = findIndex(numbers, target);

            if (index == target) {
                System.out.println("Индекс числа " + target + ": " + findIndex(numbers, target));
            } else {
                System.out.println("Число " + target + " не найдено в массиве");
            }
            }
        public static int findIndex(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }
        }
    }


