package lesson8.transport;

import lesson8.Movement;

public class Tractor extends Transport implements Movement {
    public Tractor(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Plows the field");

    }

    @Override
    public void stop() {
        System.out.println("Comes to a halt and disengages its machinery");

    }
}
