package lesson7.Quadrangles;

public class Main {
    public static void main(String[] args) {
        Quadrangle quadrangle1 = new Square(9);
        quadrangle1.perimeterOfAQuadrangle();

        Quadrangle quadrangle2 = new Rectangle(5,6.5);
        quadrangle2.perimeterOfAQuadrangle();

        Quadrangle quadrangle3 = new Parallelogram(4,7);
        quadrangle3.perimeterOfAQuadrangle();

        Quadrangle quadrangle4 = new Trapeze(4,5,8,3.5);
        quadrangle4.perimeterOfAQuadrangle();

        Quadrangle quadrangle5 = new Rhombus(5);
        quadrangle5.perimeterOfAQuadrangle();
    }
}
