package by.homework.lessons.lesson17.task1;

/**
 * @author ppuchinsky
 */
@FunctionalInterface
public interface Filter<T> {
    boolean apply(T t);
}
