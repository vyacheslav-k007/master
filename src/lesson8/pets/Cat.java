package lesson8.pets;

import lesson8.Playful;

public class Cat extends Pets implements Playful {


    public Cat(String kind, String name) {
        super(kind, name);
    }

    @Override
    public void eat() {
        System.out.println("The cat's diet should consist of 60-70% animal protein - this is meat, fish, by-products of animal protein, as well as carbohydrates and fiber contained in cereals");

    }

    @Override
    public void play() {
        System.out.println("Cats are very playful");

    }
}
