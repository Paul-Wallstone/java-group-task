package by.homework.maksim.lesson10.task2;

public class Main {
    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();

        try {
            processor.readFile("Путь к файлу");
            processor.connectToDatabase("конект");
        } catch (FileNotFoundCustomException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        } catch (DatabaseConnectionException e) {
            System.err.println("Ошибка подключения к базе данных: " + e.getMessage());
        }
    }
}
