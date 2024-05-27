package by.homework.maksim;

import java.util.Scanner;

public class Lesson2Task033 {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100);

        System.out.println("Добро пожаловать в игру \"Угадай число\"!");
        System.out.println("Я загадал число от 1 до 100. Попробуй угадать!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Попытка 1. Введите вашу догадку: ");
        int numberOne = sc.nextInt();
        while (true) {
            int number = 0;
            for (int i = 0; i < 10; i++) ;
            int numberTwo = 9;
            for (int i = 0; i > 0; --i) ;
            if (numberOne == randomNum) {
                System.out.println("Поздравляю! Вы угадали число " + randomNum + " с " + number + " попытки!");
                break;
            } else if (numberOne > randomNum) {
                System.out.println("Меньше. У вас осталось " + numberTwo + " попыток.");
            } else if (numberOne < randomNum) {
                System.out.println("Больше. У вас осталось " + numberTwo + " попыток.");
            }
        }
        sc.close();
    }
}
