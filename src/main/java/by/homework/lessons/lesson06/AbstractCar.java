package by.homework.lessons.lesson06;

/**
 * @author ppuchinsky
 */
public abstract class AbstractCar implements Vichale {
    private String title;

    public AbstractCar(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void run();
}
