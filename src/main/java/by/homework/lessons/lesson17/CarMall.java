package by.homework.lessons.lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author ppuchinsky
 */
public class CarMall {
    private List<Car> cars = new ArrayList<>();

    public CarMall() {
        Car car = new Car("sedan", "BMW", 300);
        Car car2 = new Car("hatchback", "Honda", 150);
        Car car3 = new Car("sedan", "Audi", 200);
        cars.add(car);
        cars.add(car2);
        cars.add(car3);
    }

    public List<Car> filteredCar(FilterCar filterCar) {

        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (filterCar.check(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    public List<Car> filteredCar2(Predicate<Car> filterCar) {

        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (filterCar.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

}
