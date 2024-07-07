package by.homework.maksim.lesson5;

public class Main {
    public static void main(String[] args) {
        Pilot pilot1 = new Pilot("John Doe", 75, 5);
        Pilot pilot2 = new Pilot("Jane Smith", 85, 3);
        Pilot pilot3 = new Pilot("Jack Black", 90, 7);


        Car car1 = new Car("Formula1", 600, 70);
        Car car2 = new Car("Formula2", 650, 80);
        Car car3 = new Car("Formula3", 700, 75);

        RaceTrack raceTrack = new RaceTrack(700, 100);

        // Пытаемся добавить машины с пилотами на трассу
        raceTrack.addCar(car1, pilot1); // Это должно сработать
        raceTrack.addCar(car2, pilot2); // Это должно сработать
        raceTrack.addCar(car3, pilot3); // Это может не сработать из-за веса пилота

        // Выводим список допущенных машин
        Car[] allowedCars = raceTrack.listAllowedCars();
        System.out.println("Allowed cars on the track:");
        for (Car car : allowedCars) {
            System.out.println(car);
        }

        // Запускаем гонки
        raceTrack.race();
    }
}
