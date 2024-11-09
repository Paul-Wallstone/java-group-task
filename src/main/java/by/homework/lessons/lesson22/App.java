package by.homework.lessons.lesson22;

import java.sql.SQLException;

/**
 * @author ppuchinsky
 */
public class App {
    public static void main(String[] args) {
        DatabaseConfig.getInstance().initializeDatabase();

        StudentDAO studentDAO = new StudentDAO();

        try {
//            Student student = new Student(0, "Max", 20);
//            studentDAO.addStudent(student);

//            Student fetchedStudent = studentDAO.getStudent(2);
//            System.out.println("Student: " + fetchedStudent);
//
//            fetchedStudent.setName("Pavel2");
//            studentDAO.updateStudent(fetchedStudent);
//
//            fetchedStudent = studentDAO.getStudent(2);
//            System.out.println("Student: " + fetchedStudent);

            studentDAO.deleteStudent(3);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
