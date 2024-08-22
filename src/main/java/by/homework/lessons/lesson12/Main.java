package by.homework.lessons.lesson12;

import java.util.*;

/**
 * @author ppuchinsky
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Comparator<String> comparator = (a, b) -> a.length() - b.length();
        list.sort(comparator);
        list.sort((a, b) -> a.length() - b.length());
        list.sort(Comparator.comparingInt(String::length));
        Comparator<String> comparator2 = new Comparator<>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
        list.sort(Comparator.comparingInt(String::length));

        Set<Man> set = new TreeSet<>(List.of(new Man(100), new Man(66), new Man(123)));
        List<Man> manList = new ArrayList<>(List.of(new Man(100), new Man(66), new Man(123)));
        ManComparator manComparator = new ManComparator();
        manList.sort(manComparator);


        List<String> linkedList = new LinkedList<>();
        list.add("11");
        list.add("12");
        linkedList.add("11");
        linkedList.add("13");
        list.remove(1);
        linkedList.remove(1);
        System.out.println(list.size());
        System.out.println(linkedList.size());

        Deque<String> deque = (Deque<String>) linkedList;
        deque.push("10");
        deque.push("16");
        String peekFirst = deque.peekFirst();
        String peekLast = deque.peekLast();
        String popFirst = deque.pollFirst();
        String popLast = deque.pollLast();
        System.out.println(peekFirst);
        System.out.println(peekLast);
        System.out.println(popFirst);
        System.out.println(popLast);

        Queue<String> queue = deque;
        queue.add("1000");
        String peek = queue.peek();
        String poll = queue.poll();
        System.out.println(peek);
        System.out.println(poll);
    }
}
