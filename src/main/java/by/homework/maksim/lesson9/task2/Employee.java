package by.homework.maksim.lesson9.task2;

public class Employee implements Cloneable {
    private String name;
    private Adress adress;

    public Employee(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public Adress getAddress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        Employee clone = (Employee) super.clone();
        clone.setAdress(adress.clone());
        return clone;
    }
}