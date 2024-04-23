package lesson7.triangles;

public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(double firstSide, double secondSide, double thirdSide) {
        super(firstSide, secondSide, thirdSide);
    }

    public double perimeterOfATriangle(){
        double perimeter = getFirstSide() + getSecondSide() + getThirdSide();
        return perimeter;
    }

}
