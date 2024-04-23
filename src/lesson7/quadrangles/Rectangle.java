package lesson7.quadrangles;

public class Rectangle extends Quadrangle{


    public Rectangle(double length1, double length2, double width1, double width2) {
        super(length1, length2, width1, width2);
    }

    public double perimeterOfAQuadrangle(){
        return getTheFirstSide() * 2 + getTheThirdSide() * 2;
    }
}
