package lesson8.birds;

import lesson8.Walking;

public class Ostrich extends Birds implements Walking {
    public Ostrich(String species) {
        super(species);
    }

    @Override
    public void walk() {
        System.out.println("Walks and runs at high speeds");

    }

    @Override
    public void eat() {
        System.out.println("Eats plants and small animals");

    }
}
