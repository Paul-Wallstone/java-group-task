package by.homework.lessons.lesson18.model;


import java.util.List;

/**
 * @author ppuchinsky
 */
public class Car {
    private String name;
    private final int maxSpeed;
    private final List<Wheel> wheels;
    private final Engine engine;

    public Car(String name, int maxSpeed, List<Wheel> wheels, Engine engine) {
        if (wheels == null || wheels.size() != 4) {
            throw new CarException("wheels size not equal 4!");
        }
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public Engine getEngine() {
        return engine;
    }
}
