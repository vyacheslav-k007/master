package lesson8.transport;

import lesson8.Movement;

public class Car extends Transport implements Movement {
    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Drives on the road");

    }

    @Override
    public void stop() {
        System.out.println("Applies brakes and comes to a halt");

    }
}
