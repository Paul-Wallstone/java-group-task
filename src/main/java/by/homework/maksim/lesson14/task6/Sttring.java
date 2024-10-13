package by.homework.maksim.lesson14.task6;

public class Sttring {
    public static void main(String[] args) {
        String str = "  Это  строка           с  пробелами  ";
        String result = str.replaceAll(" ", "");
        System.out.println("Исходная строка: " + str);
        System.out.println("Строка без пробелов: " + result);
    }
}
