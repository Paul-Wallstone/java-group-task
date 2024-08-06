package by.homework.maksim.lesson9.task3;

public class PrototypeTest {
    void testDeepCloning() {
        Adress adress = new Adress("Main Street", "Pekin");
        Employee employee = new Employee("John Doe", adress);

        Employee clone = employee.clone();
    }

}
