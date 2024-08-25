package by.homework.lessons.lesson12;

import java.util.Comparator;

/**
 * @author ppuchinsky
 */
public class Man implements Comparable<Man> {
    private int age;

    public Man(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Man o) {
        return o.age - this.age;
    }


    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }

    public int getAge() {
        return age;
    }
}
