package by.homework.maksim.lesson10.task1;

public class UserInputProcessor {
    public void processInput(String input) throws InvalidUserInputException {
        if (input.isEmpty()) {
            throw new InvalidUserInputException("Введена пустая строка");
        }
        System.out.println("Обработка ввода: " + input);
    }
}
