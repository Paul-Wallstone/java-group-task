package by.homework.maksim.lesson14.task7;

public class Strring {
    public static String reverseCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));

            } else {
                result.append(Character.toUpperCase(ch));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String originalString = "PrImEr StRoKi";
        String reversedCaseString = reverseCase(originalString);
        System.out.println("Исходная строка: " + originalString);
        System.out.println("Строка с измененным регистром: " + reversedCaseString);
    }
}

