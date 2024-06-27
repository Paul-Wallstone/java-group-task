package by.homework.lessons.lesson04;

/**
 * @author ppuchinsky
 */
public class Book {

    private String name;
    private String author;
    private int year;

    private Book() {
        this.name = "We don't know name";
        this.author = "We don't know author ";
        this.year = 0;
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author) {
        this(name);
        this.author = author;
    }

    public Book(String name, String author, int year) {
        this(name, author);
        this.year = year;
    }

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void getInfo() {
        System.out.println("The name of this book is " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
