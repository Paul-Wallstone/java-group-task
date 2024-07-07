package by.homework.lessons.lesson07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author ppuchinsky
 */
public class Main {
    public static void main(String[] args) {
        Object client = new Client(88, "Vanya");
        Person client2 = new Client(17, "Ivan");
        Client client3 = new Client(44, "Oleg");
        Person person1 = new Person() {
            @Override
            public void displeyInfo() {
                System.out.println("Привет из анонимного");
            }
        };
        ((Client) client).displeyInfo();
        ((Person) client).displeyInfo();
        client2.displeyInfo();
        client3.displeyInfo();
        person1.displeyInfo();
        ((Client) client).test();
        Employee employee = new Employee("Grisha", PositionType.MANAGER);
        Employee employee2 = new Employee("Maga", PositionType.SECURITY);
        List<Person> persons = new ArrayList<>();
        persons.add((Person) client);
        persons.add(client2);
        persons.add(client3);
        persons.add(1, employee2);
        persons.add(4, employee);
        persons.forEach(Person::displeyInfo);
        persons.forEach(person -> person.hello("Max " + new Random().nextInt(100) + 1));

        Employee employee3 = new Employee("Petya", PositionType.DRIVER);

        EmployeeRecord pasha = new EmployeeRecord("Pasha", PositionType.DRIVER);

        System.out.println("I am %s with position %s".formatted(pasha.name(), pasha.type()));
    }
}
