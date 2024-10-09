package by.homework.maksim.lesson12.task2;

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }


        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}
