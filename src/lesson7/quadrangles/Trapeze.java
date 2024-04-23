package lesson7.quadrangles;

public class Trapeze extends Quadrangle{
    public Trapeze(double theFirstSide, double theSecondSide, double theThirdSide, double theFourthSide){
        super(theFirstSide, theSecondSide, theThirdSide, theFourthSide);
    }

    public double perimeterOfAQuadrangle(){
        return getTheFirstSide() + getTheSecondSide() + getTheThirdSide() + getTheFourthSide();

    }
}
