package by.homework.lessons.lesson06;

/**
 * @author ppuchinsky
 */
public class Ostrich implements Animal, Bird {
    @Override
    public void sound() {
        System.out.println("Ostrich sound!!!!");
    }

    @Override
    public void fly(int speed) {
        System.out.println("Not Fly");
    }
}
