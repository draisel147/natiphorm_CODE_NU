package Lab9;

public class Rectangle {
    private String color;
    private int Width;
    private int Hight;

    public Rectangle(String color, int Width, int Hight) {
        this.Hight = Hight;
        this.Width = Width;
        this.color = color;

    }

    public int getWidth() {
        return Width;
    }

    public int getHight() {
        return Hight;
    }

    public String toString() {
        return "this shape is" + color;
    }
}
