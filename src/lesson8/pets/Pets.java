package lesson8.pets;

abstract class Pets {
    private final String kind;
    private final String name;


    public Pets (String kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    public abstract void eat();

    public String getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }
}
