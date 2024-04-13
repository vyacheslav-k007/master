package lesson7.Circles;

public class Circle {
    double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    public void  diameterCalculation(){
        double diameter = radius * 2;
        System.out.println("Diameter  of the right circle = " + diameter + " centimeters");
    }
}
