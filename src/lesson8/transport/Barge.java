package lesson8.transport;

import lesson8.Navigation;

public class Barge extends Transport implements Navigation {
    public Barge(String name) {
        super(name);
    }

    @Override
    public void navigate() {
        System.out.println("Carries cargo along the waterway");

    }

    @Override
    public void stop() {
        System.out.println("Docks at the port and secures its cargo");

    }
}
