package lesson8.birds;

import lesson8.Flying;
import lesson8.Swimming;

public class Duck extends Birds implements Swimming, Flying {
    public Duck(String species) {
        super(species);
    }

    @Override
    public void fly() {
        System.out.println("Flies");

    }

    @Override
    public void swim() {
        System.out.println("Swims gracefully");

    }

    @Override
    public void eat() {
        System.out.println("Eats insects and plants");

    }
}
