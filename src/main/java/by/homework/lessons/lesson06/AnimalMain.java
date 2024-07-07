package by.homework.lessons.lesson06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author ppuchinsky
 */
public class AnimalMain {
    public static void main(String[] args) {
        Raven raven = new Raven();
        Ostrich ostrich = new Ostrich();
        Pigeon pigeon = new Pigeon();

        List<Animal> birdsSound = new ArrayList<>();
        birdsSound.add(pigeon);
        birdsSound.add(raven);
        birdsSound.add(ostrich);
        birdsSound.add(ostrich);
        birdsSound.add(ostrich);
        birdsSound.add(ostrich);
        birdsSound.add(ostrich);
        birdsSound.add(ostrich);

        for (Animal animal : birdsSound) {
            animal.sound();
        }

        birdsSound.forEach(Animal::sound);

        List<Bird> birdsFly = new ArrayList<>();
        birdsFly.add(pigeon);
        birdsFly.add(raven);
        birdsFly.add(ostrich);
        Random random = new Random();
        for (Bird bird : birdsFly) {
            int randomNumber = random.nextInt(100) + 1;
            bird.fly(randomNumber);
        }

        birdsFly.forEach(bird -> {
            int randomNumber = random.nextInt(100) + 1;
            bird.fly(randomNumber);
        });

    }
}
