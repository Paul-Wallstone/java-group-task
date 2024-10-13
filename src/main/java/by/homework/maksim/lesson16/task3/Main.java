package by.homework.maksim.lesson16.task3;



public class Main {
    public static void main(String[] args) {
        String result = transform(" hello world ", s -> s.trim(), s -> s.toUpperCase(), s -> s.replace(" ", "-"));
        System.out.println(result);
    }

    private static String transform(String str, Transformer<String> t, Transformer<String> t1, Transformer<String> t2) {
        String strr1 = t.process(str);
        String strr2 = t1.process(strr1);
        String strr3 = t2.process(strr2);
        return strr3;
    }
}
