package by.homework.lessons.lesson06;

/**
 * @author ppuchinsky
 */
public class AUDI extends AbstractCar {
    public AUDI(String title) {
        super(title);
    }
    public void test() {
        System.out.println("test");
    }
    @Override
    public void run() {
        System.out.println("Run AUDI" + getTitle());
    }

    @Override
    public void turnLeft() {

    }
}
