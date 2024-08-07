package by.homework.maksim.lesson9.task2;

public class Adress implements Cloneable {
    private String street;
    private String city;

    public Adress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    protected Adress clone() throws CloneNotSupportedException {
        return (Adress) super.clone();
    }
}
