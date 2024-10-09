package by.homework.maksim.lesson11.task1;

import java.util.HashMap;

public class StudentManager {
    HashMap<Integer, Student> students = new HashMap<>();

    public Student getStudentById(int studentId) throws StudentNotFoundException {
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        } else {
            throw new StudentNotFoundException("Студент с ID " + studentId + " не найден");
        }
    }
}
