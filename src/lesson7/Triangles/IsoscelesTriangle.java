package lesson7.Triangles;

public class IsoscelesTriangle extends Triangle{

    public IsoscelesTriangle(double lateralSide, double basis){
        this.lateralSide = lateralSide;
        this.basis = basis;
    }

    public void perimeterOfATriangle(){
        double perimeter = 2 * lateralSide + basis;
        System.out.println("Perimeter of the isosceles triangle = " + perimeter + " centimeters");
    }
}
