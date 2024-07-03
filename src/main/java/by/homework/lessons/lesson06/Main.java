package by.homework.lessons.lesson06;

/**
 * @author ppuchinsky
 */
public class Main {
    static String name = "Mini";

    public static String getNameFromMain() {
        return "Mini";
    }

    public static void main(String[] args) {
//        Animal dog = () -> System.out.println("Dog sound: Hufff Hufff");
//        Animal cat = () -> System.out.println("Cat sound: Myauwww!!!");
        Animal mouse = new Animal() {
            @Override
            public void dna() {

            }

            public static String name = "Mini";

            public static void test() {
                System.out.println("test!!!");
            }

            @Override
            public void sound() {
                System.out.println("Mouse " + name + " sound: Pi Pi!!!");
                test();
            }

            public String getName() {
                return "Mikki";
            }
        };

        mouse.sound();


        Animal dog2 = new Dog();
        Animal cat2 = new Cat();
        Dog dog1 = new Dog();


        Animal[] animals = new Animal[]{dog2, cat2, mouse};
        for (Animal animal : animals) {
            animal.sound();
        }
        LifeSubject[] subjects = new LifeSubject[]{dog2, cat2, mouse};
        for (LifeSubject subject : subjects) {
            subject.dna();
        }

        BMW bmw = new BMW(" M4");
        AUDI audi = new AUDI(" A4");
        KIA kia = new KIA(" K5");

        AbstractCar[] cars = new AbstractCar[]{bmw, audi, kia};
        for (AbstractCar car : cars) {
            car.run();
            car.getTitle();
        }
    }
}
