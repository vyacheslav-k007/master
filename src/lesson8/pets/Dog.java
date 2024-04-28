package lesson8.pets;

import lesson8.Playful;
import lesson8.Swimming;

public class Dog extends Pets implements Playful, Swimming {
    public Dog(String kind, String name) {
        super(kind, name);
    }

    @Override
    public void play() {
        System.out.println("Dogs are very playful");

    }

    @Override
    public void swim() {
        System.out.println("Dogs are very good swimmers");

    }

    @Override
    public void eat() {
        System.out.println("The basis of the dog's diet should be proteins, mainly of animal origin");


    }
}
