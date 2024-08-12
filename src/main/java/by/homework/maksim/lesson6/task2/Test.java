package by.homework.maksim.lesson6.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ppuchinsky
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car("BMW", 300);
        Bicycle bicycle = new Bicycle("BMW", 1);
        ElectricCar electricCar = new ElectricCar("BYD", 255, 75);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bicycle);
        vehicles.add(electricCar);

        vehicles.forEach(Vehicle::move);
    }
}
