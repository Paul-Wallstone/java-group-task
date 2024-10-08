package by.homework.maksim.lesson9.task2;


public class EmployeeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Adress adress = new Adress("Main Street", "Paris");
        Employee employee = new Employee("John Doe", adress);

        Employee clone = employee.clone();

        clone.getAddress().setCity("London");
        System.out.println(employee.getAddress().getCity());
        System.out.println(clone.getAddress().getCity());
    }
}
