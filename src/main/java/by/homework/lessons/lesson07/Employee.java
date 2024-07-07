package by.homework.lessons.lesson07;

public class Employee extends Person {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void displeyInfo() {
        System.out.println("меня зовут: " + name + " , должность: " + position);
    }
}
