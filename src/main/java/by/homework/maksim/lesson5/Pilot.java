package by.homework.maksim.lesson5;

public class Pilot {
    private String name;
    private double weight;
    private int experience;

    public Pilot(String name, double weight, int experience) {
        this.name = name;
        this.weight = weight;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", experience=" + experience +
                '}';
    }
}
