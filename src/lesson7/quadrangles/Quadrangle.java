package lesson7.quadrangles;

public class Quadrangle {
    private final double theFirstSide;
    private final double theSecondSide;
    private final double theThirdSide;
    private final double theFourthSide;

    public double getTheFirstSide() {
        return theFirstSide;
    }

    public double getTheSecondSide() {
        return theSecondSide;
    }

    public double getTheThirdSide() {
        return theThirdSide;
    }

    public double getTheFourthSide() {
        return theFourthSide;
    }

    public Quadrangle(double theFirstSide, double theSecondSide, double theThirdSide, double theFourthSide) {
        this.theFirstSide = theFirstSide;
        this.theSecondSide = theSecondSide;
        this.theThirdSide = theThirdSide;
        this.theFourthSide = theFourthSide;
    }
    public double perimeterOfAQuadrangle(){
        return theFirstSide * 4;
    }

}
