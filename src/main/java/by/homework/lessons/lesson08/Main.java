package by.homework.lessons.lesson08;

import by.homework.lessons.lesson04.Car;
import by.homework.lessons.lesson07.Client;
import by.homework.lessons.lesson07.Employee;
import by.homework.lessons.lesson07.Person;
import by.homework.lessons.lesson07.PositionType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author ppuchinsky
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person() {
            @Override
            public void displeyInfo() {

            }
        };

        Object array = new Car[]{};

        Employee employeeBD = new Employee("Petr", PositionType.DRIVER);
        Employee employee2WEB = new Employee("Petr", PositionType.DRIVER);
        Client client = new Client(22, "Vasya");

        employeeBD.displeyInfo();
        employee2WEB.displeyInfo();
        employeeBD.setSize(55);
        employee2WEB.setSize(22);

        System.out.println("Объекты равны? -  " + employeeBD.equals(employee2WEB));
        System.out.println(employeeBD.getClass().getName());
        System.out.println("---------------------------------------");
        List<String> list = new ArrayList<>();

        ToStringProcessor<Employee, String> employeeToStringProcessor = new ToStringProcessor<>(employeeBD, "rgrg");
        ToStringProcessor<Employee, String> employeeToStringProcessor2 = new ToStringProcessor<>(employee2WEB, "rgr");
        ToStringProcessor<Person, String> employeeToStringProcessor3 = new ToStringProcessor<>(person, "errgr");
        ToStringProcessor<Client, String> employeeToStringProcessor4 = new ToStringProcessor<>(client, "eaf");
        employeeToStringProcessor.print();
        employeeToStringProcessor2.print();
        employeeToStringProcessor3.print();
        employeeToStringProcessor4.print();

        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(33);


        for (var obj : list1) {
            System.out.println(0 + obj);
        }
    }
}
