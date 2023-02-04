package Lab9;

public class Rectangle extends Shape {

    private int width = 0;
    private int height = 0;

    public Rectangle(String colour, int width, int height) {
        super(colour);
        this.height = height;
        this.width = width;

    }

    public int getWidth() {
        return width;
    }

    public int getHight() {
        return height;
    }

    public String toString() {
        return "Rectangle (" + width + ", " + height + "): " + super.toString();
    }

}
