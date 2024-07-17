package by.homework.maksim.lesson6.task2;

public class Car extends Vehicle {


    public Car(String brand, int engine) {
        super(brand, engine);
    }

    @Override
    public void move() {
        System.out.println("Поехал ");

    }
}
