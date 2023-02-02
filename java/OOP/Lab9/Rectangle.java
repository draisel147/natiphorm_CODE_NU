package Lab9;

public class Rectangle extends Shape {

    private int width = 0;
    private int hight = 0;

    public Rectangle(String colour, int width, int hight) {
        super(colour);
        this.hight = hight;
        this.width = width;

    }

    public int getWidth() {
        return width;
    }

    public int getHight() {
        return hight;
    }

}
