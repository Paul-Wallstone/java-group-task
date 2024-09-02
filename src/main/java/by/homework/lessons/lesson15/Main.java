package by.homework.lessons.lesson15;

/**
 * @author ppuchinsky
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String str = "Hello!";
        String str2 = "Hello!";
        StringBuilder stringBuilder = new StringBuilder(str);
        int i = 0;
        while (++i <= 1000) {
            str += "!";
            stringBuilder.append("!");
        }

        stringBuilder.reverse();

        System.out.println(stringBuilder.toString());
        System.out.println(str);
    }
}
