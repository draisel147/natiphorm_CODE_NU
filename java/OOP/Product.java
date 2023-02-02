
// For Lab7Task1 code
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " " + price + "  " + "baht";
    }

    public boolean equals(Product s) {
        return name == s.name & price == s.price;
    }

}
