package by.homework.lessons.lesson9;

/**
 * @author ppuchinsky
 */
public class Box implements Cloneable {
    private int number;
    private Book book;

    public Box(Book book, int number) {
        this.book = book;
        this.number = number;
    }

    public Box(Box box) {
        this.book = new Book(box.getBook());
        this.number = box.getNumber();
    }

    public Book getBook() {
        return book;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public Box clone() {
        try {
            Box clone = (Box) super.clone();
            Book book1 = clone.getBook();
            clone.setBook(book1.clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
