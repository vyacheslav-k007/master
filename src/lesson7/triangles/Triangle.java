package lesson7.triangles;

public class Triangle {

    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;


    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public Triangle (double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double perimeterOfATriangle(){
        return getFirstSide() + getSecondSide() + getThirdSide();
    }



}
