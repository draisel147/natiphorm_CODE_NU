package Lab9;

public class Circle extends Shape {
    private int radius;

    public Circle(String colour, int radius) {
        super(colour);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "this shape is " + colour;
    }

}
