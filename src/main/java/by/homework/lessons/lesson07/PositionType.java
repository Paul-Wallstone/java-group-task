package by.homework.lessons.lesson07;

/**
 * @author ppuchinsky
 */
public enum PositionType {
    DRIVER("driver"),
    MANAGER("manager"),
    PREMANAGER("premanager"),
    SECURITY("security");

    private String title;

    PositionType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
