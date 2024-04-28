package lesson8.pets;

import lesson8.Playful;

public class Hamster extends Pets implements Playful {
    public Hamster(String kind, String name) {
        super(kind, name);
    }

    @Override
    public void play() {
        System.out.println("Hamsters are playful");

    }

    @Override
    public void eat() {
        System.out.println("Hamster diet In nature, the basis of the hamster menu is seeds and cereals, as well as roots, fruits and leaves of plants");

    }
}
