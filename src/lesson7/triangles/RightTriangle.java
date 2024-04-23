package lesson7.triangles;

public class RightTriangle extends Triangle{
    public RightTriangle(double firstSide, double secondSide, double thirdSide) {
        super(firstSide, secondSide, thirdSide);
    }

    public double perimeterOfATriangle(){
        double perimeter = getFirstSide() + getSecondSide() + getThirdSide();
        return perimeter;
    }
}
