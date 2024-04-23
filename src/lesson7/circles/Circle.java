package lesson7.circles;

public class Circle {
    double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    public double diameterCalculation(){
        double diameter = radius * 2;
        return diameter;
    }
}
