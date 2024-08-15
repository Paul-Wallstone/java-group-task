package by.homework.maksim.lesson10.task1;

public class UserInputProcessor {
    public void processInput(String input) throws InvalidUserInputException {
        if (input == null || input.isEmpty()) {
            throw new InvalidUserInputException("Введен null или пустая строка");
        }
        System.out.println("Обработка ввода: " + input);
    }
}
