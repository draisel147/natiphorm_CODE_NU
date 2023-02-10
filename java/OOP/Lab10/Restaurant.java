package Lab10;

public class Restaurant extends Place {
    private String foodType;

    public Restaurant(String name, String address, String province, String foodString) {
        super(name, address, province);
        this.foodType = foodString;
    }

    public String getFoodType() {
        return foodType;
    }

    public boolean isThaiFood() {
        return foodType.equals("Thai");
    }

    public boolean hasSameFoodType(Restaurant food) {
        return this.foodType.equals(food.foodType);
    }
}
