package lesson8.fish;

import lesson8.Swimming;

public class Pike extends Fish implements Swimming {

    public Pike(String species, int age) {
        super(species, age);

    }

    @Override
    public void eat() {
        System.out.println("The basis of the pike's diet is the fish that is the most numerous in this reservoir");

    }

    @Override
    public void swim() {
        System.out.println("Pike swims gracefully");

    }
}
