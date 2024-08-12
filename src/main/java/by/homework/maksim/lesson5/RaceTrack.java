package by.homework.maksim.lesson5;

import java.util.Arrays;

public class RaceTrack {
    private double maxCarPower;
    private double minCarPower;
    private Car[] allowedCars;
    private int index;
    private int size = 5;

    public RaceTrack(double maxCarPower, double minCarPower) {
        if (minCarPower > 0 && maxCarPower < 1000) {
            this.maxCarPower = maxCarPower;
            this.minCarPower = minCarPower;
            this.allowedCars = new Car[size];
        } else {
            throw new RuntimeException("Не валидное значение");
        }

    }


    public boolean canCarRace(Car car) {
        double carPower = car.getPower();
        return carPower >= minCarPower && carPower <= maxCarPower;
    }

    public void addCar(Car car, Pilot pilot) {
        if (canCarRace(car) && index < size) {
            car.setPilot(pilot);
            allowedCars[++index] = car;
        }
    }

    public void addCar(Car car) {
        if (canCarRace(car) && index < size) {
            allowedCars[++index] = car;
        }
    }

    public boolean removeCar(Car car) {
        for (int i = 0; i < allowedCars.length; i++) {
            if (allowedCars[i] == car) {
                allowedCars[i] = null;
                return true;
            }
        }
        return false;
    }

    public Car[] listAllowedCars() {
        return allowedCars;
    }

    public void race() {
        for (Car car : allowedCars)
            if (car != null) {
                car.drive();
            }

    }

    @Override
    public String toString() {
        return "RaceTrack{" +
                "maxCarPower=" + maxCarPower +
                ", minCarPower=" + minCarPower +
                ", allowedCars=" + Arrays.toString(allowedCars) +
                '}';
    }
}






