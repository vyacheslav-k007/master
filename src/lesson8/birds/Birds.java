package lesson8.birds;

public abstract class Birds {
    private final String species;

    public Birds (String species) {
        this.species = species;
    }
    public abstract void eat();

    public String getSpecies() {
        return species;
    }
}
