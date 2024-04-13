package lesson7.Triangles;

public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new IsoscelesTriangle(7,6);
        triangle1.perimeterOfATriangle();

        Triangle triangle2 = new EquilateralTriangle(8);
        triangle2.perimeterOfATriangle();

        Triangle triangle3 = new RightTriangle(7,4,5);
        triangle3.perimeterOfATriangle();


    }
}
