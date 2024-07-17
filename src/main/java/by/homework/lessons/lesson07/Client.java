package by.homework.lessons.lesson07;

public class Client extends Person {
    private int age;
    private final String name;

    public Client(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void test(){
        System.out.println("test");
    }

    @Override
    public void displeyInfo() {
        System.out.println("Мой возраст: " + age + " , зовут: " + name);
    }

    @Override
    public String toString() {
        return "Client{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
