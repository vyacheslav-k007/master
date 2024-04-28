package lesson8.birds;

import lesson8.Walking;

public class Kiwi extends Birds implements Walking {
    public Kiwi(String species) {
        super(species);
    }

    @Override
    public void walk() {
        System.out.println("Walks and forages for food");

    }

    @Override
    public void eat() {
        System.out.println("Eats insects and fruits");

    }
}
