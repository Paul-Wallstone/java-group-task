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

        List<List<Integer>> subLists = new ArrayList<>();
        for (int i = 0; i < originalList.size(); i += subListSize) {
            int toIndex = Math.min(i + subListSize, originalList.size());
            subLists.add(originalList.subList(i, toIndex));
        }

        for (List<Integer> subList : subLists) {
            System.out.println(subList);
        }
    }
}
