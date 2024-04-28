package lesson8.birds;

import lesson8.Swimming;

public class Penguin extends Birds implements Swimming {
    public Penguin(String species) {
        super(species);
    }

    @Override
    public void swim() {
        System.out.println("Swims gracefully");

    }

    @Override
    public void eat() {
        System.out.println("Eats fish");

    }
}
