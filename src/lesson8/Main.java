package lesson8;

import lesson8.birds.*;
import lesson8.fish.Catfish;
import lesson8.fish.Crucian;
import lesson8.fish.Pike;
import lesson8.pets.Cat;
import lesson8.pets.Dog;
import lesson8.pets.Hamster;
import lesson8.transport.*;

public class Main {
    public static void main(String[] args) {

        Catfish catfish = new Catfish("Silurus glanis",2 );
        System.out.println("Catfish - " + catfish.getSpecies() + ", age - " + catfish.getAge());
        catfish.swim();
        catfish.eat();
        System.out.println();

        Crucian crucian = new Crucian("Golden", 1);
        System.out.println("Crucian - " + crucian.getSpecies() + ", age - " + crucian.getAge());
        crucian.swim();
        crucian.eat();
        System.out.println();

        Pike pike = new Pike("Esos lucius", 3);
        System.out.println("Pike - " + pike.getSpecies() + ", age - " + pike.getAge());
        pike.swim();
        pike.eat();
        System.out.println();

        Cat cat = new Cat("Siamese", "Froska");
        System.out.println("Cat - " + cat.getKind() + ", Name - " + cat.getName());
        cat.eat();
        cat.play();
        System.out.println();

        Dog dog = new Dog("French bulldog", "Sultan");
        System.out.println("Dog - " + dog.getKind() + ", Name - " + dog.getName());
        dog.eat();
        dog.play();
        System.out.println();

        Hamster hamster = new Hamster("Chinese","Hunter");
        System.out.println("Hamster - " + hamster.getKind() + ", Name - " + hamster.getName());
        hamster.eat();
        hamster.play();
        System.out.println();

        Duck duck = new Duck("Peking");
        System.out.println("Duck - " + duck.getSpecies());
        duck.fly();
        duck.eat();
        duck.swim();
        System.out.println();

        Eagle eagle = new Eagle("Aquila chrysaetos");
        System.out.println("Eagle - " + eagle.getSpecies());
        eagle.eat();
        eagle.fly();
        System.out.println();

        Kiwi kiwi = new Kiwi("Gray");
        System.out.println("Kiwi - " + kiwi.getSpecies());
        kiwi.eat();
        kiwi.walk();
        System.out.println();

        Ostrich ostrich = new Ostrich("African");
        System.out.println("Ostrich - " + ostrich.getSpecies());
        ostrich.eat();
        ostrich.walk();
        System.out.println();

        Penguin penguin = new Penguin("Royal");
        System.out.println("Penguin - " + penguin.getSpecies());
        penguin.eat();
        penguin.swim();
        System.out.println();

        Pigeon pigeon = new Pigeon("Gray");
        System.out.println("Pigeon - " + pigeon.getSpecies());
        pigeon.eat();
        pigeon.fly();
        System.out.println();

        Stork stork = new Stork("White");
        System.out.println("Stork - " + stork.getSpecies());
        stork.eat();
        stork.fly();
        System.out.println();

        Airplane airplane = new Airplane("Boeing 747");
        System.out.println("Airplane - " + airplane.getName());
        airplane.stop();
        airplane.fly();
        System.out.println();

        Barge barge = new Barge("Bulk");
        System.out.println("Barge - " + barge.getName());
        barge.navigate();
        barge.stop();
        System.out.println();

        Boat boat = new Boat("Inflatable");
        System.out.println("Boat - " + boat.getName());
        boat.navigate();
        boat.stop();
        System.out.println();

        Bus bus = new Bus("Еталон");
        System.out.println("Bus - " + bus.getName());
        bus.move();
        bus.stop();
        System.out.println();

        Car car = new Car("Daewoo Lanos");
        System.out.println("Car - " + car.getName());
        car.move();
        car.stop();
        System.out.println();

        Helicopter helicopter = new Helicopter("Mi-8");
        System.out.println("Helicopter - " + helicopter.getName());
        helicopter.fly();
        helicopter.stop();
        System.out.println();

        HotAirBalloon hotAirBalloon = new HotAirBalloon("Rozier");
        System.out.println("HotAirBalloon - " + hotAirBalloon.getName());
        hotAirBalloon.fly();
        hotAirBalloon.stop();
        System.out.println();

        Speedboat speedboat = new Speedboat("Гюрза-М");
        System.out.println("Speedboat - " + speedboat.getName());
        speedboat.navigate();
        speedboat.stop();
        System.out.println();

        Tractor tractor = new Tractor("Case 310");
        System.out.println("Tractor - " + tractor.getName());
        tractor.move();
        tractor.stop();


















    }
}
