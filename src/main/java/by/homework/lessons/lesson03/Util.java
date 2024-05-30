package by.homework.lessons.lesson03;

/**
 * @author ppuchinsky
 */
public class Util {

    public Util init() {
        return new Util();
    }

    void printHello() {
        System.out.println("Hello: " + this);
    }

    void printHello(String name) {
        System.out.println("Hello: " + name);
    }

    void printHello(String name, int age) {
        System.out.println("Hello: " + name + " my age: " + age);
    }

    public static String getResult(int number) {
        return switch (number) {
            case 1 -> "1";
            case 2 -> "2";
            default -> "default";
        };
    }

    public static void getResult(int... numbers) {
        for (int num : numbers) {
             switch (num) {
                case 1 -> System.out.println("1");
                case 2 -> System.out.println("2");
                default -> System.out.println("default");
            }
        }
    }
}
