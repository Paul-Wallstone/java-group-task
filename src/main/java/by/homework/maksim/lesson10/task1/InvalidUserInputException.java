package by.homework.maksim.lesson10.task1;

public class InvalidUserInputException extends Exception {
    public InvalidUserInputException(String message) {
        super(message);
    }

    public InvalidUserInputException(String message, Throwable cause) {
        super(message, cause);
    }
}