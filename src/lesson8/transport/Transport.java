package lesson8.transport;

public abstract class Transport {

    private final String name;

    public Transport(String name) {
        this.name = name;
    }

    public abstract void stop();

    public String getName() {
        return name;
    }
}



