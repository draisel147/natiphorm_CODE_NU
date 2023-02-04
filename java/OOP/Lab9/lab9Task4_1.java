package Lab9;

public class lab9Task4_1 {
    public static void main(String[] args) {
        Shape shapeA = new Rectangle("pink", 3, 4);
        Shape shapeB = new Circle("yellow", 7);

        System.out.println("Width = " + ((Rectangle) shapeA).getWidth());
        System.out.println("Radius = " + ((Circle) shapeB).getRadius());
    }
}
