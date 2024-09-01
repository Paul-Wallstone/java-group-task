package by.homework.maksim.lesson13;

/**
 * @author ppuchinsky
 */
public class Main {
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
