package by.homework.maksim.lesson5;

public class Car {
    private String name;
    private double power;
    private double maxPilotWeigh;
    private Pilot pilot;

    public Car(String name, double power, double maxPilotWeigh) {
        this.name = name;
        this.power = power;
        this.maxPilotWeigh = maxPilotWeigh;
    }

    boolean isPilotSuitable(Pilot pilot, double maxPilotWeigh) {

        return pilot.getWeight() <= maxPilotWeigh;
    }

    public static void drive(Pilot pilot, double power, double maxPilotWeigh) {

        double pilotWeight = pilot.getWeight();
        if (maxPilotWeigh - pilotWeight >= 0) ;
        else if (maxPilotWeigh - pilotWeight >= -10) {
            power = power - (power * 0.8);
        } else if (maxPilotWeigh - pilotWeight >= -20) {
            power = power - (power * 0.6);
        } else if (maxPilotWeigh - pilotWeight >= -30) {
            power = power - (power * 0.4);
        } else power = 0;
    }

    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }

    public double getMaxPilotWeigh() {
        return maxPilotWeigh;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", maxPilotWeigh=" + maxPilotWeigh +
                ", pilot=" + pilot +
                '}';
    }
}
