package lesson7.circles;

public class Circle {
    private final double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    public double diameterCalculation(){
        return radius * 2;
    }
}
