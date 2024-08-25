package by.homework.maksim.lesson12.task1;

import by.homework.lessons.lesson12.ManComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Phil", 20, 2.5));
        students.add(new Student("Alex", 19, 4.4));
        students.add(new Student("Will", 20, 3.3));
        students.add(new Student("Paul", 44, 7.9));

        LinkedList<Student> studentsByName = new LinkedList<>(students);
        Collections.sort(studentsByName, Comparator.comparing(Student::getName));
        System.out.println("Отсортированные по имени студенты:");
        studentsByName.forEach(System.out::println);


        LinkedList<Student> studentsByAge = new LinkedList<>(students);
        Collections.sort(studentsByAge, Comparator.comparingInt(Student::getAge));
        System.out.println("Отсортированные по возрасту студенты:");
        studentsByAge.forEach(System.out::println);

        LinkedList<Student> studentsByGrade = new LinkedList<>(students);
        Collections.sort(studentsByGrade, Comparator.comparingDouble(Student::getGrade).reversed());
        System.out.println("Отсортированные по оценке студенты:");
        studentsByGrade.forEach(System.out::println);

    }
}
