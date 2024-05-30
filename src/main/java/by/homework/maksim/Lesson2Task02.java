package by.homework.maksim;

import java.util.Scanner;

public class Lesson2Task02 {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор команд!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите команду (+, -, *, /): ");
        String command = sc.next();
        System.out.println("Введите первое число: ");
        int numberOne = sc.nextInt();

        System.out.println("Введите второе число: ");
        int numberTwo = sc.nextInt();

        switch (command) {
            case "+" -> System.out.println("Результат: " + (numberOne + numberTwo));
            case "-" -> System.out.println("Результат: " + (numberOne - numberTwo));
            case "*" -> System.out.println("Результат: " + (numberOne * numberTwo));
            case "/" ->  System.out.println("Результат: " + (numberOne / numberTwo));
            default -> System.out.println("Ошибка ввода");
        }

        sc.close();
    }
}
