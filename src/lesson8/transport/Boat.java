package lesson8.transport;

import lesson8.Navigation;

public class Boat extends Transport implements Navigation {
    public Boat(String name) {
        super(name);
    }

    @Override
    public void navigate() {
        System.out.println("Sails on the water or oars");

    }

    @Override
    public void stop() {
        System.out.println("Drops anchor and stops drifting");

    }
}
