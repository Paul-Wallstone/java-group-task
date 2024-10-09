package by.homework.maksim.lesson16.task2;

@FunctionalInterface
public interface Converter<T, R> {
    R convert(T t);
}
