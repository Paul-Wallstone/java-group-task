package by.homework.maksim.lesson6.task1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Developer());
        employees.add(new Designer());
        employees.add(new Manager());

        for (Employee employee : employees) {
            employee.work();
            System.out.println();
        }
    }
}
