package lesson8.birds;

import lesson8.Flying;

public class Eagle extends Birds implements Flying {
    public Eagle(String species) {
        super(species);
    }

    @Override
    public void fly() {
        System.out.println("Flies");

    }

    @Override
    public void eat() {
        System.out.println("Eats small mammals and birds");

    }
}
