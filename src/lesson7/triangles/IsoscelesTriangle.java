package lesson7.triangles;

public class IsoscelesTriangle extends Triangle{

    public IsoscelesTriangle(double firstSide, double secondSide, double basis) {
        super(firstSide, secondSide, basis);

    }

    public double perimeterOfATriangle(){
        return 2 * getFirstSide() + getThirdSide();
    }
}
