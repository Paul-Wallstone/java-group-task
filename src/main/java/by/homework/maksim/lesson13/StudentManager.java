package by.homework.maksim.lesson13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentManager {
    private Set<Student> students = new HashSet<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentById(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();

                break;
            }
        }
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student student1 = new Student("Maria", 1);
        Student student2 = new Student("Petr", 2);
        Student student3 = new Student("Maria", 1);

        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);

        manager.printAllStudents();

        manager.removeStudentById(2);

        System.out.println("Student:");
        manager.printAllStudents();
    }
}
