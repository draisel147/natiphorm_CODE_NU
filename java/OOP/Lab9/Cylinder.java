package Lab9;

public class Cylinder extends Circle {

    private int Height;

    public Cylinder(String colour, int radius, int Height) {
        super(colour, radius);
        this.Height = Height;

    }

    public double getArea() {
        return 2 * Math.PI * getRadius() * Height;
    }

    public String toString() {
        return "Cylinder (" + getRadius() + " , " + Height + "): " + "This shape is " + getColour();
    }

}
