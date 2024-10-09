package by.homework.lessons.lesson18;

import by.homework.lessons.lesson18.model.Car;
import by.homework.lessons.lesson18.model.Engine;
import by.homework.lessons.lesson18.model.Wheel;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author ppuchinsky
 */
public class MainStream {
    public static void main(String[] args) {
        int[] intArr = new int[]{1, 1, 2, 2, 5, 5, 5, 2, 3, 6, 9, 10, 555, 10};
        IntStream intStream = IntStream.of(intArr);
        OptionalInt maxOpt = intStream.max();
        if (maxOpt.isPresent()) {
            System.out.println(maxOpt.getAsInt());
        } else {
            System.out.println("No number");
        }

        IntStream.of(intArr)
                .filter(number -> number > 2 && number < 10)
                .peek(num -> System.out.println("number from filter:" + num))
                .max()
                .ifPresentOrElse((num) -> System.out.println(num),
                        () -> System.out.println("No number2"));

        int sum = IntStream.of(intArr).limit(3).map(num -> num * 10).sum();
        System.out.println(sum);

        System.out.println("---------------------------------------------------------------");
        List<Car> cars = getCarsFromFactory();

        for (Car car : cars) {
            String oldName = car.getName();
            String newName = "Belarus " + oldName;
            car.setName(newName);
            System.out.println(car.getName());
        }

        List<Car> cars2 = getCarsFromFactory();
        System.out.println("---------------------------------------------------------------");
        cars2.stream()
                .map(car -> car.setName("Belarus " + car.getName()))
                .forEach(car -> System.out.println(car.getName()));


        System.out.println("---------------------------------------------------------------");
        cars2.stream().mapToInt(car -> car.getMaxSpeed()).average().ifPresentOrElse(avg -> System.out.println(avg),
                () -> System.out.println("Avg not found"));

        int sumCars = cars2.stream().mapToInt(car -> car.getMaxSpeed()).sum();
        System.out.println(sumCars);

        cars2.stream().mapToInt(car -> car.getMaxSpeed()).max().ifPresentOrElse(avg -> System.out.println(avg),
                () -> System.out.println("Max not found"));

        int sumOfWheels = cars2.stream().mapToInt(car -> car.getWheels().size()).sum();
        System.out.println(sumOfWheels);
    }


    private static List<Car> getCarsFromFactory() {
        List<Car> cars = new ArrayList<>();

        List<Wheel> belshina = List.of(
                new Wheel("Belshina"),
                new Wheel("Belshina"),
                new Wheel("Michelin"),
                new Wheel("Michelin"));
        Engine engine = new Engine(200);

        Car car = new Car("BMW", 260, belshina, engine);
        Car car2 = new Car("BMW", 260, belshina, engine);
        Car car3 = new Car("AUDI", 270, belshina, engine);
        Car car4 = new Car("AUDI", 270, belshina, engine);
        Car car5 = new Car("RENO", 210, belshina, engine);
        Car car6 = new Car("RENO", 210, belshina, engine);
        Car car7 = new Car("Lada", 180, belshina, engine);
        Car car8 = new Car("Lada", 180, belshina, engine);


        cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        return cars;
    }


}
