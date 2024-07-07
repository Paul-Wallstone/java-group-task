package by.homework.maksim.lesson5;

import java.util.Arrays;

public class RaceTrack {
    private double maxCarPower;
    private double minCarPower;
    private Car[] allowedCars;

    public RaceTrack(double maxCarPower, double minCarPower) {
        this.maxCarPower = maxCarPower;
        this.minCarPower = minCarPower;
    }

    public void carPower(double maxCarPower, double minCarPower) {
        if (minCarPower > 0 || maxCarPower < 1000)
            return maxCarPower;
    }

    public boolean canCarRace(Car car) {
        double carPower = car.getPower();
        return carPower >= minCarPower && carPower <= maxCarPower;
    }

    public boolean addCar(Car car, Pilot pilot) {
        if (!canCarRace(car)) {
            return true;
        }
        return false;
    }

    public boolean addCar(Car car) {
        if (canCarRace(car)) ;
        return true;
    }


    public boolean removeCar(Car car) {
        for (int i = 0; i < allowedCars.length; i++) {
            if (allowedCars[i] == car) ;
            return true;
        }
        return false;
    }

    public Car[] listAllowedCars() {
        return allowedCars.clone();
    }

    public void race() {
        for (Car car : allowedCars) {
            System.out.println("Starting race for car: " + car.getName());
            car.drive();
            System.out.println("Race finished for car: " + car.getName());
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






