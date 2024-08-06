package by.homework.maksim.lesson9.task2;

public class Employee implements Cloneable {
    private String name;
    private Adress adress;

    public Employee(String name, Adress adress) {
        this.name = name;
    }

    public Employee(String String) {
    }

    public String getName() {
        return name;
    }

    public Adress getAddress() {
        return adress;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee clone = (Employee) super.clone();
        clone.adress = (Adress) adress.clone();
        return clone;
    }
}