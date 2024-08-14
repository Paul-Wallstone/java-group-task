package by.homework.maksim.lesson10.task2;

public class FileNotFoundCustomException extends Exception {
    public FileNotFoundCustomException(String message) {
        super(message);
    }

    public FileNotFoundCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
