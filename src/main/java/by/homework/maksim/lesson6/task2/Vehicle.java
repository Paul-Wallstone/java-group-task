package by.homework.maksim.lesson6.task2;

public abstract class Vehicle {
    private String brand;
    private int engine;

    public Vehicle(String brand, int engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public abstract void move();
}
