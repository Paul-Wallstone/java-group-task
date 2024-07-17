package by.homework.maksim.lesson6.task2;

public class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String brand, int engine, int batteryLevel) {
        super(brand, engine);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void move() {
        System.out.println("Помчал " + "батарея: " + batteryLevel);

    }
}
