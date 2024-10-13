package by.homework.maksim.lesson16.task3;

@FunctionalInterface
public interface Transformer<T> {
    T process(T t);
}
