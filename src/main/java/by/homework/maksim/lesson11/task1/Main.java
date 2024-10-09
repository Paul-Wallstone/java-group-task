package by.homework.maksim.lesson11.task1;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        Student student1 = new Student(1, "Ivan", 20, 1);
        Student student2 = new Student(2, "Oleg", 22, 2);
        studentManager.students.put(student1.getStudentId(), student1);
        studentManager.students.put(student2.getStudentId(), student2);

        try {
            Student foundStudent = studentManager.getStudentById(3);
            System.out.println("Найденный студент: " + foundStudent.getName());
        } catch (StudentNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
