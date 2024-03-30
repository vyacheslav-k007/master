package lesson6.task3;

public class Main {
    public static void main(String[] args) {
        IsoscelesTriangle isoscelesTriangle1 = new IsoscelesTriangle(5.6,8,4);
        System.out.println("Lateral side = " + isoscelesTriangle1.getLateralSide() + " centimeters," + " Basis = " + isoscelesTriangle1.getBasis() + " centimeters," + " Height = " + isoscelesTriangle1.getHeight()+ " centimeters");
        isoscelesTriangle1.areaOfATriangle();
        isoscelesTriangle1.perimeterOfATriangle();
        System.out.println();

        IsoscelesTriangle isoscelesTriangle2 = new IsoscelesTriangle(8,8.5,7);
        System.out.println("Lateral side = " + isoscelesTriangle2.getLateralSide() + " centimeters," + " Basis = " + isoscelesTriangle2.getBasis() + " centimeters," + " Height = " + isoscelesTriangle2.getHeight()+ " centimeters");
        isoscelesTriangle2.areaOfATriangle();
        isoscelesTriangle2.perimeterOfATriangle();
    }
}
