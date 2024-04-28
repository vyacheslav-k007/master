package lesson8.transport;

import lesson8.Flying;

public class HotAirBalloon extends Transport implements Flying {
    public HotAirBalloon(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flies using hot air buoyancy");

    }

    @Override
    public void stop() {
        System.out.println("Gradually releases hot air and descends to the ground");

    }
}
