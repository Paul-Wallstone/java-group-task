package by.homework.lessons.lesson04;

import java.util.Random;

/**
 * @author ppuchinsky
 */
public class Car {
    private String label;
    private int year;
    private Engine engine;

    public Car() {
    }

    public Car(String label, int year, Engine engine) {
        this.label = label;
        this.year = year;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car " + label + " with year: " + year + " with engine " + engine.getType() + " started and speed is - "
                + new Random().nextInt(251) + "km/h");
    }

    public String getLabel() {
        return label;
    }

    public int getYear() {
        return year;
    }


    public void setLabel(String label) {
        this.label = label;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
