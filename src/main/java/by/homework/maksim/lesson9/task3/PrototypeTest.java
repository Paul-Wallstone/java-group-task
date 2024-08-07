package by.homework.maksim.lesson9.task3;

public class PrototypeTest {
    public static void main(String[] args) {
        testDeepCloning();
    }

    static void testDeepCloning() {
        Adress adress = new Adress("Main Street", "Pekin");
        Employee employee = new Employee("John Doe", adress);
        Employee clone = employee.clone();
        clone.getAdress().setCity("Minsk");
        System.out.println(employee.getAdress().getCity());
        System.out.println(clone.getAdress().getCity());
    }
}
