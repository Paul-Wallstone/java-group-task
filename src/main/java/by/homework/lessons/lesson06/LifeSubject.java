package by.homework.lessons.lesson06;

/**
 * @author ppuchinsky
 */
public interface LifeSubject {
    default void dna() {
        System.out.println("DNA of " + this.getClass().getSimpleName() + ": " + this);
    }
}
