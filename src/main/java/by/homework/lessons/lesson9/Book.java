package by.homework.lessons.lesson9;

/**
 * @author ppuchinsky
 */
public class Book implements Cloneable {
    private String title;


    public Book(String title) {
        this.title = title;
    }

    public Book(Book book) {
        this.title = book.getTitle();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        Book clone = (Book) super.clone();
        return clone;
    }
}
