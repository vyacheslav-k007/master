package lesson7.quadrangles;

public class Parallelogram extends Quadrangle{

    public Parallelogram(double theFirstSide, double theSecondSide, double theThirdSide, double theFourthSide) {
        super(theFirstSide, theSecondSide, theThirdSide, theFourthSide);
    }

    public double perimeterOfAQuadrangle(){
        return getTheFirstSide() * 2 + getTheThirdSide() * 2;
    }
}
