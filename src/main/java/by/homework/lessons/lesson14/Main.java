package by.homework.lessons.lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author ppuchinsky
 */
public class Main {
    public static void main(String[] args) {
        String str = null;

        if (Objects.nonNull(str) && str.isEmpty()) {
            System.out.println("Empty!");
        }

        str = "Hello!";

        int length = str.length();
        System.out.println("Length:" + length);

        char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }
        System.out.println("Hello".concat("!!!").concat("&&&&&"));

        int num = 111;
        extracted(String.valueOf(num));

        List<String> strings = List.of("Hel", "lo", "!!!");
        String strResult = String.join("---", strings);
        String strResult2 = strings.stream().collect(Collectors.joining(";"));

        System.out.println(strResult);
        System.out.println(strResult2);


        for (int i = strResult2.length() - 1; i >= 0; i--) {
            System.out.println(strResult2.charAt(i));
        }
        System.out.println("-------------");
        String str4 = "Hello!!!";
        String str5 = "Hello!!!";
        String str6 = "HELLO!!!";
        String str7 = new String(str4.toCharArray());

        System.out.println(str4 == str5);
        System.out.println(str4 == str7);
        System.out.println(str4.equals(str5));
        System.out.println(str4.equalsIgnoreCase(str6));

        System.out.println(str4.lastIndexOf("l"));
        String path = " File.exe ";
        System.out.println(path.trim().endsWith(".exe"));
        String replaced = path.replace(".exe", ".doc");
        System.out.println(replaced);

        String substring = path.trim().substring(0, path.indexOf(".") - 1);
        System.out.println(substring.toLowerCase());
        System.out.println(substring.toUpperCase());
    }

    private static void extracted(String num) {
        System.out.println(num);
    }


}
