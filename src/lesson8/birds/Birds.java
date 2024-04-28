package lesson8.birds;

public abstract class Birds {
    private String species;

    public Birds (String species) {
        this.species = species;
    }
    public abstract void eat();

    public String getSpecies() {
        return species;
    }
}
