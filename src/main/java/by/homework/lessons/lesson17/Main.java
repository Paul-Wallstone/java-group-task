package by.homework.lessons.lesson17;

import java.util.List;
import java.util.function.Function;

/**
 * @author ppuchinsky
 */
public class Main {

    private static void print(Function<Car, String> func, Car car) {
        System.out.println(func.apply(car));
    }

    public static void main(String[] args) {
        CarMall carMall = new CarMall();
        List<Car> audiOld = carMall.filteredCar(new FilterCar() {
            @Override
            public boolean check(Car car) {
                return car.getCompany().equals("Audi");
            }
        });
        List<Car> more150Old = carMall.filteredCar(new FilterCar() {
            @Override
            public boolean check(Car car) {
                return car.getPower() > 150;
            }
        });


        List<Car> hatchbackOld = carMall.filteredCar(new FilterCar() {
            @Override
            public boolean check(Car car) {
                return car.getType().equals("hatchback");
            }
        });
        System.out.println(audiOld);
        System.out.println(more150Old);
        System.out.println(hatchbackOld);
        System.out.println("------------------------------------------------");

        List<Car> audi = carMall.filteredCar2(c -> c.getCompany().equals("Audi"));
        List<Car> more150 = carMall.filteredCar2(c -> c.getPower() > 150);
        List<Car> hatchback = carMall.filteredCar2(c -> c.getType().equals("hatchback"));

        System.out.println(audi);
        System.out.println(more150);
        System.out.println(hatchback);

        Car car = new Car("sedan", "BMW", 300);
//        Function<Car, String> func = c -> c.getPower() +"";
        print(c -> c.getCompany(), car);
    }

}
