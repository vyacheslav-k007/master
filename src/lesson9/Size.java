package lesson9;

public enum Size {
    S("S", 50, 60),
    M("M", 60, 70),
    L("L", 70, 80),
    XL("XL", 80, 90);

    private final String abbreviation;
    private final int width;
    private final int length;

    private Size(String abbreviation, int width, int length) {
        this.abbreviation = abbreviation;
        this.width = width;
        this.length = length;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
    @Override
    public String toString() {
        return "Size{" +
                "abbreviation='" + abbreviation + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}