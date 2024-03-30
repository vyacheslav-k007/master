package lesson6.task3;

public class IsoscelesTriangle {
    private double lateralSide;
    private double basis;
    private double height;

    public IsoscelesTriangle(double lateralSide, double basis, double height){
        this.lateralSide = lateralSide;
        this.basis = basis;
        this.height = height;
    }

    public double getBasis() {
        return basis;
    }

    public double getHeight() {
        return height;
    }

    public double getLateralSide() {
        return lateralSide;
    }

    public void areaOfATriangle() {
        double area = (basis * height) / 2;
        System.out.println("Area of a triangle = " + area + " square centimeters");
    }

    public void perimeterOfATriangle(){
        double perimeter = 2 * lateralSide + basis;
        System.out.println("Perimeter of the triangle = " + perimeter + " centimeters");
    }
}
