package by.homework.lessons.lesson06;

/**
 * @author ppuchinsky
 */
public interface Bird {
    default void fly(int speed) {
        System.out.println("Fly not more than " + speed + " km/h");
    }
}
