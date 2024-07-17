package by.homework.lessons.lesson08;

import by.homework.lessons.lesson07.Person;

import java.util.List;

/**
 * @author ppuchinsky
 */
public class ToStringProcessor<T, R> {
    private final T t;
    private final R r;


    public ToStringProcessor(T t, R r) {
        this.t = t;
        this.r = r;
    }

    public void test(List<? extends Person> list2) {
        list2.forEach(Person::displeyInfo);
    }

    public void print() {
        System.out.println(t);
        System.out.println(r);
    }
}
