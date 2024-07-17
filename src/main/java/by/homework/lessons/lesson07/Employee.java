package by.homework.lessons.lesson07;

import java.util.Objects;

public class Employee extends Person {
    private String name;
    private PositionType position;
    private int size;

    public Employee(String name, PositionType position) {
        this.name = name;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void displeyInfo() {
        System.out.println("меня зовут: " + name + " , должность: " + position.getTitle());
    }
    public <T extends Person>void displeyInfoGeneric(T t) {
        System.out.println(t);
    }
    @Override
    public String toString() {
        return "My name %s".formatted(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && position == employee.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
