package by.homework.lessons.lesson12;

import java.util.Comparator;

/**
 * @author ppuchinsky
 */
public class ManComparator implements Comparator<Man> {
    @Override
    public int compare(Man o1, Man o2) {
        return o1.getAge()- o2.getAge();
    }
}
