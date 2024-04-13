package lesson7.Triangles;

public class RightTriangle extends Triangle{
    public RightTriangle(double firstSide, double secondSide, double thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public void perimeterOfATriangle(){
        double perimeter = firstSide + secondSide + thirdSide;
        System.out.println("Perimeter of the right triangle = " + perimeter + " centimeters");
    }
}
