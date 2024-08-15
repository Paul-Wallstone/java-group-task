package by.homework.maksim.lesson10.task2;

public class FileProcessor {
    public void readFile(String filePath) throws FileNotFoundCustomException {
        if (filePath == null || filePath.isEmpty()) {
            throw new FileNotFoundCustomException("Файл не найден: " + filePath);
        }
        System.out.println("Файл " + filePath + " прочитан");
    }

    public void connectToDatabase(String databaseUrl) throws DatabaseConnectionException {
        if (databaseUrl == null || databaseUrl.isEmpty()) {
            throw new DatabaseConnectionException("Ошибка подключения к базе данных: " + databaseUrl);
        }
        System.out.println("Подключение к базе данных " + databaseUrl + " установлено");
    }
}
