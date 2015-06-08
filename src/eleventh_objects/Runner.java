package eleventh_objects;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        //Type varName = new Type()
        Animal animal = new Animal(2, "some noise");

        Animal cat = new Animal(4, "Meow");
        cat.setAge(5);
        System.out.println(cat);
        System.out.println(cat.makeNoise());

        Dog dog1 = new Dog();

        System.out.println(dog1.getNumLegs());

        Bird bird = new Bird();
        bird.setAge(4);
        bird.makeNoise("plop");
        System.out.println(bird);

        Animal randomAnimal = getRandomAnimal();

        System.out.println(randomAnimal.makeNoise());


    }

    public static Animal getRandomAnimal() {
        Random random = new Random();

        boolean aBoolean = random.nextBoolean();
        if (aBoolean) {
            return new Dog();
        } else {
            return new Bird();
        }

    }
}
