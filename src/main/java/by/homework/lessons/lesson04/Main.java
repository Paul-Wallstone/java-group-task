package by.homework.lessons.lesson04;

/**
 * @author ppuchinsky
 */
public class Main {
    public static void main(String[] args) {
//
//        Book book0 = new Book();
//        book0.getInfo();
//
//
//        Book book1 = new Book("Hurry Poter");
//        Book book2 = new Book("Java 2017", 2018);
//
//        book1.getInfo();
//        book2.getInfo();
//
//        new Book("Hurry Poter").getInfo();

        Car car1 = new Car("BMW", 2001, new Engine("Disel"));
        Car car2 = new Car("AUDI", 2010, new Engine("Gas"));
        Car car3 = new Car("Lada", 2015, new Engine("Electra"));
        car1.start();
        car2.start();
        car3.start();
        car1.setLabel("BMVV");
        car1.start();

    }
}
