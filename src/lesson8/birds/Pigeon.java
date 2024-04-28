package lesson8.birds;

import lesson8.Flying;

public class Pigeon extends Birds implements Flying {
    public Pigeon(String species) {
        super(species);
    }

    @Override
    public void fly() {
        System.out.println("Flies swiftly");

    }

    @Override
    public void eat() {
        System.out.println("Eats seeds and grains");

    }
}
