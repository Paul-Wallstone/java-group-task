package by.homework.lessons.lesson22;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ppuchinsky
 */
public class StudentDAO {

    public void addStudent(Student student) throws SQLException {
        String query = "INSERT INTO student (name, age) VALUES (?, ?)";
        Connection connection = DatabaseConfig.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, student.getName());
        preparedStatement.setInt(2, student.getAge());
        preparedStatement.executeUpdate();
    }

    public Student getStudent(int id) throws SQLException {
        String query = "SELECT * FROM student WHERE id = ?";
        Connection connection = DatabaseConfig.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            return new Student(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("age"));
        }

        return null;
    }

    public List<Student> getAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM student";
        Connection connection = DatabaseConfig.getInstance().getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            students.add(new Student(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("age")));
        }
        return students;
    }

    public void updateStudent(Student student) throws SQLException {
        String query = "UPDATE student SET name = ?, age = ? WHERE id = ?";
        Connection connection = DatabaseConfig.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, student.getName());
        preparedStatement.setInt(2, student.getAge());
        preparedStatement.setInt(3, student.getId());
        preparedStatement.executeUpdate();

    }

    public void deleteStudent(int id) throws SQLException {
        String query = "DELETE FROM student WHERE id = ?";
        Connection connection = DatabaseConfig.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();

    }
}
