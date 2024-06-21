package by.homework.lessons.lesson05;

import java.util.Objects;

/**
 * @author ppuchinsky
 */
public class User {
    private final String name;
    private final int age;
    private String bio;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, int age, String bio) {
        this(name, age);
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bio='" + bio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
