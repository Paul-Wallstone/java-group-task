package by.homework.lessons.lesson06;

/**
 * @author ppuchinsky
 */
public class Cat implements Animal {
    private String name = "Cat";

    public String getName() {
        return name;
    }

    @Override
    public void sound() {
        System.out.println(getName() + " sound from class: Myauwww!!!");
    }

    @Override
    public void dna() {

    }
}
