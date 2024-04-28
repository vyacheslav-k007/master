package lesson8.fish;

abstract class Fish {
    private final String species;
    private final int age;


    public Fish(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public abstract void eat();

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }
}
