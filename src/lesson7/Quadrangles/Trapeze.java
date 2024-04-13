package lesson7.Quadrangles;

public class Trapeze extends Quadrangle{
    public Trapeze(double lengthOfTheFirstSide, double lengthOfTheSecondSide, double lengthOfTheThirdSide, double lengthOfTheFourthSide){
        this.lengthOfTheFirstSide = lengthOfTheFirstSide;
        this.lengthOfTheSecondSide = lengthOfTheSecondSide;
        this.lengthOfTheThirdSide = lengthOfTheThirdSide;
        this.lengthOfTheFourthSide = lengthOfTheFourthSide;
    }

    public void perimeterOfAQuadrangle(){
        double perimeter = lengthOfTheFirstSide + lengthOfTheSecondSide + lengthOfTheThirdSide + lengthOfTheFourthSide;
        System.out.println("Perimeter of the trapeze = " + perimeter + " centimeters");
    }
}
