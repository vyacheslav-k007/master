package lesson7.Quadrangles;

public class Quadrangle {
    public double lengthOfTheFirstSide;
    public double lengthOfTheSecondSide;
    public double lengthOfTheThirdSide;
    public double lengthOfTheFourthSide;
    public double width;

    public void perimeterOfAQuadrangle(){
        double perimeter = lengthOfTheFirstSide * 4;
        if (this instanceof Square) {
            System.out.println("Perimeter of the square = " + perimeter + " centimeters");
        }else{
                System.out.println("Perimeter of the rhombus = " + perimeter + " centimeters");
            }
    }

}
