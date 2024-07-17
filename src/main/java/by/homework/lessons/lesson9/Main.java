package by.homework.lessons.lesson9;

/**
 * @author ppuchinsky
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        test1();
        System.out.println("-------------------------------------");
        test2();
        System.out.println("-------------------------------------");
        test3();
        System.out.println("-------------------------------------");
        test4();
    }

    private static void test1() {
        Book book1 = new Book("Капитанская дочка");
        Book book2 = book1;
        Book book3 = new Book("ОНО1");
        book3.setTitle("ОНО2");
        book2.setTitle("ОНО");
        System.out.println(book1.getTitle());
        System.out.println(book3.getTitle());
    }

    private static void test2() throws CloneNotSupportedException {
        Book book1 = new Book("Капитанская дочка");
        Book book2 = book1.clone();
        book2.setTitle("ОНО");
        System.out.println(book1.getTitle());
    }

    private static void test3() {
        Box box1 = new Box(new Book("ОНО"), 1);
        Box box2 = box1.clone();
        box2.setNumber(2);
        box2.getBook().setTitle("Test!");
        System.out.println(box1.getNumber());
        System.out.println(box2.getNumber());
        System.out.println(box1.getBook().getTitle());
        System.out.println(box2.getBook().getTitle());
    }

    private static void test4() {
        Box box1 = new Box(new Book("ОНО"), 1);
        Box box2 = new Box(box1);
        box2.setNumber(2);
        box2.getBook().setTitle("Test!");
        System.out.println(box1.getNumber());
        System.out.println(box2.getNumber());
        System.out.println(box1.getBook().getTitle());
        System.out.println(box2.getBook().getTitle());
    }
}
