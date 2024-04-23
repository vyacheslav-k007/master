package lesson7;

import lesson7.circles.Circle;
import lesson7.circles.CircleNew;
import lesson7.quadrangles.*;
import lesson7.triangles.EquilateralTriangle;
import lesson7.triangles.IsoscelesTriangle;
import lesson7.triangles.RightTriangle;
import lesson7.triangles.Triangle;

public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new IsoscelesTriangle(7,7,5);
        double perimeter6 = triangle1.perimeterOfATriangle();
        System.out.println("Perimeter of the isosceles triangle = " + perimeter6 + " centimeters");

        Triangle triangle2 = new EquilateralTriangle(8,8,8);
        double perimeter7 = triangle2.perimeterOfATriangle();
        System.out.println("Perimeter of the equilateral triangle = " + perimeter7 + " centimeters");

        Triangle triangle3 = new RightTriangle(7,4,5);
        double perimeter8 = triangle3.perimeterOfATriangle();
        System.out.println("Perimeter of the right triangle = " + perimeter8 + " centimeters");

        Quadrangle quadrangle1 = new Square(9,9,9,9);
        double perimeter1 = quadrangle1.perimeterOfAQuadrangle();
        System.out.println("Perimeter of the square = " + perimeter1 + " centimeters");

        Quadrangle quadrangle2 = new Rectangle(4,4,2,2);
        double perimeter2 = quadrangle2.perimeterOfAQuadrangle();
        System.out.println("Perimeter of the rectangle = " + perimeter2 + " centimeters");

        Quadrangle quadrangle3 = new Parallelogram(5,5,3,3);
        double perimeter3 = quadrangle3.perimeterOfAQuadrangle();
        System.out.println("Perimeter of the parallelogram = " + perimeter3 + " centimeters");

        Quadrangle quadrangle4 = new Trapeze(4,5,8,3.5);
        double perimeter4 = quadrangle4.perimeterOfAQuadrangle();
        System.out.println("Perimeter of the trapeze = " + perimeter4 + " centimeters");

        Quadrangle quadrangle5 = new Rhombus(9,9,9,9);
        double perimeter5 = quadrangle5.perimeterOfAQuadrangle();
        System.out.println("Perimeter of the rhombus = " + perimeter5 + " centimeters");

        Circle circle1 = new CircleNew(5);
        double diameter = circle1.diameterCalculation();
        System.out.println("Diameter  of the circle = " + diameter + " centimeters");

    }
}
