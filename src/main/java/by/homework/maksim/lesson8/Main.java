package by.homework.maksim.lesson8;

public class Main {
    public static void main(String[] args) {

        GenericArrayList<String> stringList = new GenericArrayList<>(10);
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("Value contain1: " + stringList.contains("Hello"));
        System.out.println("Value contain2: " + stringList.contains("Hello1"));

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("Value: " + stringList.get(i));
        }


        GenericArrayList<Integer> intList = new GenericArrayList<>();
        intList.add(10);
        intList.add(20);
        System.out.println("Value int contain1: " + intList.contains(20));
        System.out.println("Value int contain2: " + intList.contains(11));

        for (int i = 0; i < intList.size(); i++) {
            System.out.println("Value: " + intList.get(i));
        }
    }
}
