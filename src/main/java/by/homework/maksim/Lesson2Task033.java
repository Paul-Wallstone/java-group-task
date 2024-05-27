package by.homework.maksim;

import java.util.Scanner;

public class Lesson2Task033 {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100);
        int count = 1;
        final int limit = 11;
        boolean statusWin = false;
        System.out.println("Добро пожаловать в игру \"Угадай число\"!");
        System.out.println("Я загадал число от 1 до 100. Попробуй угадать!");
        Scanner sc = new Scanner(System.in);

        while (count < limit) {
            System.out.println("Попытка " + count + ". Введите вашу догадку: ");
            int numberOne = sc.nextInt();
            count++;
            if (numberOne == randomNum) {
                System.out.println("Поздравляю! Вы угадали число " + randomNum + " с " + (count - 1) + " попытки!");
                statusWin = true;
                break;
            } else if (numberOne > randomNum) {
                System.out.println("Меньше. У вас осталось " + (limit - count) + " попыток.");
            } else if (numberOne < randomNum) {
                System.out.println("Больше. У вас осталось " + (limit - count) + " попыток.");
            }
        }
        if (!statusWin) {
            System.out.println("Вы проиграли...");
        }
        sc.close();
    }
}
