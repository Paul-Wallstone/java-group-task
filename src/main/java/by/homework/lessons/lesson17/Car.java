package by.homework.lessons.lesson17;

/**
 * @author ppuchinsky
 */
public class Car {
    private String type;
    private String company;
    private int power;

    public Car(String type, String company, int power) {
        this.type = type;
        this.company = company;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", company='" + company + '\'' +
                ", power=" + power +
                '}';
    }
}
