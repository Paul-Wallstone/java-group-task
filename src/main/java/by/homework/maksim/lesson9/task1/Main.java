package by.homework.maksim.lesson9.task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        new Person("Bob",66);
        Person person = new Person("Pol", 77);
        Person person1 = person.clone();
        person1.setName("Phil");
        System.out.println(person1.getName());
    }
}
