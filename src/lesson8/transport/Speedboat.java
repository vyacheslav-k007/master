package lesson8.transport;

import lesson8.Navigation;

public class Speedboat extends Transport implements Navigation {
    public Speedboat(String name) {
        super(name);
    }

    @Override
    public void navigate() {
        System.out.println("Speeds through the water");

    }

    @Override
    public void stop() {
        System.out.println("Slows down and comes to a stop");

    }
}
