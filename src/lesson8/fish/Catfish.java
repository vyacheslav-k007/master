package lesson8.fish;

import lesson8.Swimming;

public class Catfish extends Fish implements Swimming {

    public Catfish(String species, int age) {
        super(species, age);
    }

    @Override
    public void eat() {
        System.out.println("Catfish eats large benthic invertebrates, often amphibians, reptiles, waterfowl and small mammals");

    }

    @Override
    public void swim() {
        System.out.println("Catfish swims smoothly");
    }
}
