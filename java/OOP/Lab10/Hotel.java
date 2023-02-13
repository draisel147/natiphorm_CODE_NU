package Lab10;

public class Hotel extends Place {
    private int price;

    public Hotel(String n, String add, String pro, int price) {
        super(n, add, pro);
        this.price = price;
    }

    public int calculatePrice(int night) {
        return price * night;
    }

    public int calculatePrice(int night, int room) {
        return price * night * room;
    }
}