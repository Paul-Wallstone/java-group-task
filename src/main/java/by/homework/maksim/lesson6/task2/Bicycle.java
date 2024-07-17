package by.homework.maksim.lesson6.task2;

public class Bicycle extends Vehicle {
    public Bicycle(String brand, int engine) {
        super(brand, engine);
    }

    @Override
    public void move() {
        System.out.println("Поехали ");

    }
}
