package lesson8.transport;

import lesson8.Movement;

public class Bus extends Transport implements Movement {
    public Bus(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Travels along its route");

    }

    @Override
    public void stop() {
        System.out.println("Pulls over and stops at the bus stop");

    }
}
