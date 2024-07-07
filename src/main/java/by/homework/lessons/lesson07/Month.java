package by.homework.lessons.lesson07;

/**
 * @author ppuchinsky
 */
public enum Month {
    JANUARY("январь"), FEBRUARY("февраль");
    private String title;

    public String getTitle() {
        return title;
    }

    Month(String title) {
        this.title = title;
    }
}
