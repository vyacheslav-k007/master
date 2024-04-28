package lesson8.transport;

import lesson8.Flying;

public class Airplane extends Transport implements Flying {
    public Airplane(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flies using its engines and wings");

    }

    @Override
    public void stop() {
        System.out.println("Slows down and lands on the runway.");

    }
}
