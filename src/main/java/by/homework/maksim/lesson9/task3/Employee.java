package by.homework.maksim.lesson9.task3;

public class Employee implements Prototype<Employee> {
    private String name;
    private Adress adress;

    public Employee(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public Employee clone() {
        return new Employee(name, adress.clone());
    }
}