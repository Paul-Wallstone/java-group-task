package by.homework.lessons.lesson06;

/**
 * @author ppuchinsky
 */
public class KIA extends AbstractCar  {
    public KIA(String title) {
        super(title);
    }
    public void test() {
        System.out.println("test");
    }
    @Override
    public void run() {
        System.out.println("Run KIA" + getTitle());
    }

    @Override
    public void turnLeft() {

    }
}
