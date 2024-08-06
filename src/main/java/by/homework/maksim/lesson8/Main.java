package by.homework.maksim.lesson8;

public class Main {
    public static void main(String[] args) {

        GenericArrayList<String> stringList = new GenericArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("String list: " + stringList);


        GenericArrayList<Integer> intList = new GenericArrayList<>();
        intList.add(10);
        intList.add(20);
        System.out.println("Объекты равны? -  " + intList.equals(stringList));
    }
}
