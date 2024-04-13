package lesson7.Quadrangles;

public class Rectangle extends Quadrangle{
    public Rectangle(double lengthOfTheFirstSide, double width){
        this.lengthOfTheFirstSide = lengthOfTheFirstSide;
        this.width = width;
    }

    public void perimeterOfAQuadrangle(){
        double perimeter = lengthOfTheFirstSide * 2 + width * 2;
        System.out.println("Perimeter of the rectangle = " + perimeter + " centimeters");
    }
}
