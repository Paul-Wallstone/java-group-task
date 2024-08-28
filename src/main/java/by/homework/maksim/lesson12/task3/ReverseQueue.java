package by.homework.maksim.lesson12.task3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(7);
        queue.add(4);

        deque.addAll(queue);

        while (!deque.isEmpty()) {
            System.out.println(deque.pollLast());
        }
    }
}
