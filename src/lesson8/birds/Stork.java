package lesson8.birds;

import lesson8.Flying;

public class Stork extends Birds implements Flying {
    public Stork(String species) {
        super(species);
    }

    @Override
    public void fly() {
        System.out.println("Flies gracefully");

    }

    @Override
    public void eat() {
        System.out.println("Eats fish and small animals");

    }
}
