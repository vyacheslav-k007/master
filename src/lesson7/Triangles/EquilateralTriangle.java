package lesson7.Triangles;

public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(double firstSide){
        this.firstSide = firstSide;
    }

    public void perimeterOfATriangle(){
        double perimeter = firstSide * 3;
        System.out.println("Perimeter of the equilateral triangle = " + perimeter + " centimeters");
    }

}
