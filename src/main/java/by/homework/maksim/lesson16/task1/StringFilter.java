package by.homework.maksim.lesson16.task1;

@FunctionalInterface
public interface StringFilter<T> {
    boolean apply(T t);
}
