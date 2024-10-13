package by.homework.maksim.lesson14.task5;


public class Sstring {
    public static String reverseString(String str) {
        int p1 = 0;
        int p2 = str.length() - 1;
        char[] chars = str.toCharArray();
        while (p1 <= p2) {
            char c = chars[p1];
            chars[p1] = chars[p2];
            chars[p2] = c;
            p1++;
            p2--;
        }

        return new String(chars);
    }

    public static void reverseString2(StringHolder str) {
        int p1 = 0;
        int p2 = str.getStr().length() - 1;
        char[] chars = str.getStr().toCharArray();
        while (p1 <= p2) {
            char c = chars[p1];
            chars[p1] = chars[p2];
            chars[p2] = c;
            p1++;
            p2--;
        }
        str.setStr(new String(chars));
    }
    public void reverseString3(StringHolder str) {
        int p1 = 0;
        int p2 = str.getStr().length() - 1;
        char[] chars = str.getStr().toCharArray();
        while (p1 <= p2) {
            char c = chars[p1];
            chars[p1] = chars[p2];
            chars[p2] = c;
            p1++;
            p2--;
        }
        str.setStr(new String(chars));
    }

    public static void main(String[] args) {
        String originalString = "Hello, world!";
        StringHolder stringHolder = new StringHolder();
        stringHolder.setStr(originalString);
        reverseString2(stringHolder);
        System.out.println(stringHolder.getStr());
        String s = reverseString(originalString);
        System.out.println(s);
    }
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
}
