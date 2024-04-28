package lesson8.fish;

import lesson8.Swimming;

public class Crucian extends Fish implements Swimming {
    public Crucian (String species, int age) {
        super(species, age);
    }

    @Override
    public void eat() {
        System.out.println("Crucian  feed on vegetation, small invertebrates, zooplankton, zoobenthos and detritus");

    }

    @Override
    public void swim() {
        System.out.println("Crucian swims slowly");

    }
}
