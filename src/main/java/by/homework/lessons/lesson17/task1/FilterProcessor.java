package by.homework.lessons.lesson17.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ppuchinsky
 */
public class FilterProcessor {
    public List<String> filter(List<String> strings, Filter<String> filter) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (filter.apply(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public List<String> filter2(List<String> strings, Filter<List<String>> filter) {
        if (filter.apply(strings)) {
            return strings;
        }

        return List.of();
    }
}
