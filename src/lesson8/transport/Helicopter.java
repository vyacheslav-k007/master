package lesson8.transport;

import lesson8.Flying;

public class Helicopter extends Transport implements Flying {
    public Helicopter(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flies by rotating its blades");

    }

    @Override
    public void stop() {
        System.out.println("Reduces its rotor speed and descends to the ground");

    }
}
