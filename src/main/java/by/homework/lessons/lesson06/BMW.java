package by.homework.lessons.lesson06;

/**
 * @author ppuchinsky
 */
public class BMW extends AbstractCar {

    public BMW(String title) {
        super(title);
    }

    public void test() {
        System.out.println("test");
    }

    @Override
    public void run() {
        System.out.println("Run BMW" + getTitle());
    }

    @Override
    public void turnLeft() {

    }
}
