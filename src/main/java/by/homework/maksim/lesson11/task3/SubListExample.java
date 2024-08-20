package by.homework.maksim.lesson11.task3;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            originalList.add(i);
        }

        int subListSize = 5;

        for (int from = 0; from < originalList.size(); from += subListSize) {
            int to = Math.min(from + subListSize, originalList.size());
            System.out.println(originalList.subList(from, to));
        }
    }
}
