package by.homework.lessons.lesson11;

import java.util.*;

/**
 * @author ppuchinsky
 */
public class MainMap {
    static class User {
        private final String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        Map<String, User> map = new HashMap<>();
        User user = new User("Petya");
        User user2 = new User("Maksim");
        User user3 = new User("Sasha");

        map.put(user.getName(), user);
        map.put(user2.getName(), user2);
        map.put(user3.getName(), user3);

        map.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println("----------------------------------------------");


        User user1 = map.get("Maksim");
        System.out.println(user1);
        System.out.println("----------------------------------------------");

        System.out.println("Size: " + map.size());
        System.out.println("Contain key: " + map.containsKey("Maksim"));
        System.out.println("Contain key: " + map.containsKey("Maksim1"));
        System.out.println("Is empty: " + map.isEmpty());
        System.out.println("----------------------------------------------");

        map.remove("Petya");
        System.out.println("Size: " + map.size());
        map.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println("----------------------------------------------");

        Collection<User> values = map.values();
        List<User> users = new ArrayList<>(values);
        users.forEach(System.out::println);
        System.out.println("----------------------------------------------");

        Map<String, User> map2 = new HashMap<>();
        User user4 = new User("Petya1");
        User user5 = new User("Maksim");
        User user6 = new User("Sasha1");
        map2.put(user4.getName(), user4);
        map2.put(user5.getName(), user5);
        map2.put(user6.getName(), user6);

        map.putAll(map2);
        map.forEach((key, value) -> System.out.println(value));
        System.out.println("----------------------------------------------");
        User userDefault1 = map.get("Petya2");
        System.out.println(userDefault1);
        User userDefault2 = map.getOrDefault("Petya2", new User("Petya2"));
        System.out.println(userDefault2);
        System.out.println("----------------------------------------------");
        map.clear();
        System.out.println("Size clear: " + map.size());
    }
}
