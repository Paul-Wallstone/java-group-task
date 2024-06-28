package by.homework.lessons.lesson06;

/**
 * @author ppuchinsky
 */
public class Dog implements Animal {
    private String name = "Dog";

    public String getName() {
        return name;
    }

    @Override
    public void sound() {
        System.out.println(getName() + " sound from class: Hufff Hufff");
    }

    @Override
    public void dna() {

    }
}
