package by.homework.lessons.lesson10;

/**
 * @author ppuchinsky
 */
public class DevideByZeroException extends Exception {
    public DevideByZeroException(String message) {
        super(message);
    }

    public DevideByZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
