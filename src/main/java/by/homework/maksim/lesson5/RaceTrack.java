package by.homework.maksim.lesson5;

public class RaceTrack {
    private double maxCarPower;
    private double minCarPower;
    private Car[] allowedCars;

    public RaceTrack(double maxCarPower, double minCarPower) {
        this.maxCarPower = maxCarPower;
        this.minCarPower = minCarPower;
    }

    public double carPower(double maxCarPower, double minCarPower) {
        if (minCarPower > 0 || maxCarPower < 1000) {
            return carPower(maxCarPower, minCarPower);
        }
    }

    public boolean canCarRace(Car car) {
        double carPower = car.getPower();
        return carPower >= minCarPower && carPower <= maxCarPower;
    }

    public boolean addCar(Car car, Pilot pilot) {
        if (!canCarRace(car)) {
            return false;

        }

    }
}






