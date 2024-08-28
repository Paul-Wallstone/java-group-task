package by.homework.lessons.lesson12;

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

    public int getAge() {
        return age;
    }
}
