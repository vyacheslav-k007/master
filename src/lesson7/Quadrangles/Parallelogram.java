package lesson7.Quadrangles;

public class Parallelogram extends Quadrangle{
    public Parallelogram(double lengthOfTheFirstSide, double lengthOfTheSecondSide){
        this.lengthOfTheFirstSide = lengthOfTheFirstSide;
        this.lengthOfTheSecondSide = lengthOfTheSecondSide;
    }

    public void perimeterOfAQuadrangle(){
        double perimeter = lengthOfTheFirstSide * 2 + lengthOfTheSecondSide * 2;
        System.out.println("Perimeter of the parallelogram = " + perimeter + " centimeters");
    }
}
